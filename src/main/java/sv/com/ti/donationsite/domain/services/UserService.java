package sv.com.ti.donationsite.domain.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sv.com.ti.donationsite.domain.entities.RolEntitie;
import sv.com.ti.donationsite.domain.entities.UserEntitie;
import sv.com.ti.donationsite.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service("userDetailsService")
@Slf4j
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntitie user = userRepository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException(username);
        }
        var roles = new ArrayList<GrantedAuthority>();
        for (RolEntitie rol: user.getRoles()){
            roles.add(new SimpleGrantedAuthority(rol.getName()));
        }
        return new User(user.getUsername(), user.getPassword(), roles);
    }

    @Transactional
    public void saveUser(UserEntitie user) {
        userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public List<UserEntitie> getAllUser(){
        return userRepository.findAll();
    }

    @Transactional(readOnly = true)
    public UserEntitie findUser(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
}

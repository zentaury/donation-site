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

    public List<UserEntitie> getAllUser(){
        return userRepository.findAll();
    }
}

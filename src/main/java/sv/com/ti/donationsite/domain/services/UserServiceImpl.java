package sv.com.ti.donationsite.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.ti.donationsite.domain.entities.UserEntitie;
import sv.com.ti.donationsite.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    @Transactional(readOnly = true)
    public List<UserEntitie> getAllUsers() {
        return (List<UserEntitie>) userRepository.findAll();
    }

    @Override
    @Transactional
    public void saveUser(UserEntitie user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(UserEntitie user) {
        userRepository.delete(user);
    }

    @Override
    @Transactional(readOnly = true)
    public UserEntitie findUser(UserEntitie user) {
        return userRepository.findById(user.getUserId()).orElse(null);
    }
}

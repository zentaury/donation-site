package sv.com.ti.donationsite.domain.services;

import sv.com.ti.donationsite.domain.entities.UserEntitie;

import java.util.List;

public interface UserService {

    public List<UserEntitie> getAllUsers();

    public void saveUser(UserEntitie user);

    public void deleteUser(UserEntitie user);

    public UserEntitie findUser(UserEntitie user);
}

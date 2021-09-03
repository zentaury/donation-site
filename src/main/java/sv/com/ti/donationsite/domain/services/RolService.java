package sv.com.ti.donationsite.domain.services;

import sv.com.ti.donationsite.domain.entities.RolEntitie;

import java.util.List;

public interface RolService {
    public List<RolEntitie> getAllRoles();

    public RolEntitie findRol(RolEntitie rol);

    public void saveRol(RolEntitie rol);
}

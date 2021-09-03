package sv.com.ti.donationsite.domain.services;

import sv.com.ti.donationsite.domain.entities.RolEntity;

import java.util.List;

public interface RolService {
    public List<RolEntity> getAllRoles();

    public RolEntity findRol(RolEntity rol);

    public void saveRol(RolEntity rol);
}

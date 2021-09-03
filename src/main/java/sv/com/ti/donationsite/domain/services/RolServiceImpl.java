package sv.com.ti.donationsite.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sv.com.ti.donationsite.domain.entities.RolEntitie;
import sv.com.ti.donationsite.repositories.RolRepository;

import java.util.List;

@Service
public class RolServiceImpl implements RolService{

    @Autowired
    private RolRepository rolRepository;

    @Override
    @Transactional(readOnly = true)
    public List<RolEntitie> getAllRoles() {
        return rolRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public RolEntitie findRol(RolEntitie rol) {
        return rolRepository.findById(rol.getRolId()).orElse(null);
    }

    @Override
    @Transactional
    public void saveRol(RolEntitie rol) {
        rolRepository.save(rol);
    }
}

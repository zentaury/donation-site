package sv.com.ti.donationsite.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sv.com.ti.donationsite.domain.entities.CountryEntity;
import sv.com.ti.donationsite.repositories.CountryRepository;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryRepository countryRepository;

    @Override
    @Transactional(readOnly = true)
    public List<CountryEntity> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public CountryEntity getCountryById(Long id) {
        return countryRepository.findById(id).orElse(null);
    }
}

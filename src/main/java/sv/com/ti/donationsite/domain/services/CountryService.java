package sv.com.ti.donationsite.domain.services;

import sv.com.ti.donationsite.domain.entities.CountryEntity;

import java.util.List;

public interface CountryService {
    public List<CountryEntity> getAllCountries();
}

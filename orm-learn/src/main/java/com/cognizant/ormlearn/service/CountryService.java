package com.cognizant.ormlearn.service;
//import com.cognizant.ormlearn.repository.*;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import java.util.List;

@Service

public class CountryService {
	@Autowired
	private CountryRepository countryRepository;
	@Transactional
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}

}

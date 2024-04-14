package com.tues.db.airports.service;

import com.tues.db.airports.model.Airport;
import com.tues.db.airports.model.AirportFilter;
import com.tues.db.airports.model.Country;
import com.tues.db.airports.repository.AirportRepository;
import com.tues.db.airports.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class AirportService {

  @Autowired
  private AirportRepository airportRepository;

  @Autowired
  private CountryRepository countryRepository;

  public Page<Airport> findAllAirports(int pageNumber, int pageSize) {
    return airportRepository.findAll(PageRequest.of(pageNumber, pageSize));
  }

  public Page<Airport> filterAirports(AirportFilter airportFilter, int pageNumber, int pageSize) {
    return airportRepository.findAllByFilter(
        airportFilter.airportNames(),
        airportFilter.airportIcaoCodes(),
        airportFilter.cityIds(),
        airportFilter.countryIso2Codes(),
        PageRequest.of(pageNumber, pageSize));
  }

  public Page<Country> filterCountry(AirportFilter airportFilter, int pageNumber, int pageSize) {
    return countryRepository.findAllByFilter(
        airportFilter.airportNames(),
        airportFilter.airportIcaoCodes(),
        airportFilter.cityIds(),
        airportFilter.countryIso2Codes(),
        PageRequest.of(pageNumber, pageSize));
  }

}

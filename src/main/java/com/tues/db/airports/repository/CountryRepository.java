package com.tues.db.airports.repository;

import com.tues.db.airports.model.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

  @Query("SELECT a.city.country FROM Airport a WHERE (:airportNames IS NULL OR a.name in (:airportNames)) " +
      "AND (:airportIcaoCodes IS NULL OR a.icaoCode in (:airportIcaoCodes)) " +
      "AND (:cityIds IS NULL OR a.city.id in (:cityIds)) " +
      "AND (:countryIds IS NULL OR a.city.country.iso2CountryCode in (:countryIds))")
  Page<Country> findAllByFilter(@Param("airportNames") Set<String> airportNames,
                                @Param("airportIcaoCodes") Set<String> airportIcaoCodes,
                                @Param("cityIds") Set<Long> cityIds,
                                @Param("countryIds") Set<String> countryIds, Pageable pageable);

}

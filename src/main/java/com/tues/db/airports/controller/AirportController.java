package com.tues.db.airports.controller;

import com.tues.db.airports.model.Airport;
import com.tues.db.airports.service.AirportService;
import com.tues.db.airports.model.AirportFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/airports")
public class AirportController {

  @Autowired
  private AirportService airportService;

  @GetMapping(produces = { "application/json" })
  public ResponseEntity<Page<Airport>> getAllAirports(@RequestParam(name = "page") int page, @RequestParam(name = "pageSize") int pageSize) {
    Page<Airport> airports = airportService.findAllAirports(page, pageSize);
    System.out.println("Airports: " +airports);
    return ResponseEntity.ok(airports);
  }

  @PostMapping(value = "/filter", produces = { "application/json" })
  public ResponseEntity<Page<?>> filterAirports(@RequestBody AirportFilter airportFilter, @RequestParam(name = "countryAsRoot") boolean countryAsRoot, @RequestParam(name = "page") int page, @RequestParam(name = "pageSize") int pageSize){

    Page<?> results = countryAsRoot ? airportService.filterCountry(airportFilter, page, pageSize) : airportService.filterAirports(airportFilter, page, pageSize);
    return ResponseEntity.ok(results);
  }

}

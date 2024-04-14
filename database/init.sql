-- Insert statement 1
INSERT INTO country (iso2country_code, iso3country_code, name)
VALUES ('BG', 'BGR', 'Bulgaria');

-- Insert statement 2
INSERT INTO country (iso2country_code, iso3country_code, name)
VALUES ('TR', 'TUR', 'Turkey');

-- Insert statement 3
INSERT INTO country (iso2country_code, iso3country_code, name)
VALUES ('DE', 'DEU', 'Germany');

-- Insert statement 4
INSERT INTO country (iso2country_code, iso3country_code, name)
VALUES ('GB', 'GBR', 'United Kingdom');

-- Insert statement 5
INSERT INTO country (iso2country_code, iso3country_code, name)
VALUES ('JP', 'JPN', 'Japan');


-- Insert statement 1
INSERT INTO city (id, country_iso2country_code, name, timezone)
VALUES (1, 'BG', 'Sofia', 'Europe/Sofia');

-- Insert statement 2
INSERT INTO city (id, country_iso2country_code, name, timezone)
VALUES (2, 'TR', 'Istanbul', 'Europe/Istanbul');

-- Insert statement 3
INSERT INTO city (id, country_iso2country_code, name, timezone)
VALUES (3, 'DE', 'Munich', 'Europe/Berlin');

-- Insert statement 4
INSERT INTO city (id, country_iso2country_code, name, timezone)
VALUES (4, 'GB', 'London', 'Europe/London');

-- Insert statement 5
INSERT INTO city (id, country_iso2country_code, name, timezone)
VALUES (5, 'JP', 'Osaka', 'Asia/Tokyo');


-- Insert statement 1
INSERT INTO airport (latitude, longitude, city_id, id, iata_code, icao_code, name)
VALUES (42.6966934204102, 23.4114360809326, 1, 1, 'SOF', 'LBSF', 'Sofia Airport');

-- Insert statement 2
INSERT INTO airport (latitude, longitude, city_id, id, iata_code, icao_code, name)
VALUES (40.976922, 28.814606, 2, 2, 'IST', 'LTBA', 'Istanbul Airport');

-- Insert statement 3
INSERT INTO airport (latitude, longitude, city_id, id, iata_code, icao_code, name)
VALUES (48.357222, 11.787778, 3, 3, 'MUC', 'EDDM', 'Munich Airport');

-- Insert statement 4
INSERT INTO airport (latitude, longitude, city_id, id, iata_code, icao_code, name)
VALUES (51.470022, -0.454296, 4, 4, 'LHR', 'EGLL', 'Heathrow Airport');

-- Insert statement 5
INSERT INTO airport (latitude, longitude, city_id, id, iata_code, icao_code, name)
VALUES (34.437222, 135.244167, 5, 5, 'KIX', 'RJBB', 'Kansai International Airport');

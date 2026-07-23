package service;

import model.Country;

public class CountryService {

    public Country getCountry() {
        return new Country("IN", "India");
    }
}
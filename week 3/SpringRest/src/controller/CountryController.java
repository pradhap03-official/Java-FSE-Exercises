package controller;

import model.Country;
import service.CountryService;

public class CountryController {

    public static void main(String[] args) {

        CountryService service = new CountryService();
        Country country = service.getCountry();

        System.out.println(country.getCode());
        System.out.println(country.getName());
    }
}
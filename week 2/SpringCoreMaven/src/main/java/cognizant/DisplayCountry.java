package cognizant;

public class DisplayCountry {

    public static void main(String[] args) {

        CountryService service = new CountryService();

        Country country = service.getCountry();

        System.out.println(country);
    }
}  
}

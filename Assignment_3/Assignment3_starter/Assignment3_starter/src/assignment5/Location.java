package assignment5;

/**
 * A location consisting of a three-letter code, city, and country.
 */
public class Location {

    private String code;
    private String city;
    private String country;

    /**
     * Constructs a new Location object.
     * 
     * @param code
     * @param city
     * @param country 
     */
    public Location(String code, String city, String country) {
        this.code = code;
        this.city = city;
        this.country = country;
    }

    public String format() {
        return "Location: " + code + " (" + city + ", " + country + ")";
    }

    public String getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
} // end class Location

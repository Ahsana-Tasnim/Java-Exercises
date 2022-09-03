package Entity;



public class User {
    
    private int userId;
    private String name;
    private String email;
    private String password;
    private String city;
    private String country;

    public User(int userId, String name, String email, String password, String city, String country) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.city = city;
        this.country = country;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
    
    
}

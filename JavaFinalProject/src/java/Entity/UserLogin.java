package Entity;

public class UserLogin {
    private String name;
    private String password;

    public UserLogin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    
}

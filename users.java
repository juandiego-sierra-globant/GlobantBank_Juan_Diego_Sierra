public class users {
    private String name;
    private String password;
    private String account;

    // Constructor
    public users(String name, String password, String account) {
        this.name = name;
        this.password = password;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    public String getAccount() {
        return account;
    }

}

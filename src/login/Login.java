package login;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login implements Serializable {
    private String username;
    private String password;

    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static final String USERNAME_REGEX = "[a-zA-Z0-9]{8,}$";
    private static final String PASSWORD_REGEX = "[A-Z][a-zA-Z0-9]{8,}$";
    @Override
    public String toString() {
        return "Login{" + "username='" + username + '\'' + ", password='" + password + '\'' + '}';
    }
}
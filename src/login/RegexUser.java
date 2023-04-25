package login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUser {
    private static final String USERNAME_REGEX = "[a-zA-Z0-9]{8,}$";
    private static final String PASSWORD_REGEX = "[A-Z][a-zA-Z0-9]{8,}$";

    public RegexUser() {
    }
    public boolean username(String name) {
        Pattern pattern = Pattern.compile(USERNAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    public boolean password(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

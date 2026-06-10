package de.schulung.calculator;

public class UserValidator {

    public boolean validate(String username) {
        if (username == null) {
            return false;
        }

        if (username.length() < 5) {
            return false;
        }

        return true;
    }
}

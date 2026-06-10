package de.schulung.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {

    @Test
    void validateTooShort() {
        UserValidator userValidator = new UserValidator();
        String username = "help";

        assertFalse(userValidator.validate(username));
    }

    @Test
    void validateCorrectName() {
        UserValidator userValidator = new UserValidator();
        String username = "Philipp";

        assertTrue(userValidator.validate(username));
    }

    @Test
    void validateEmpty() {
        UserValidator userValidator = new UserValidator();
        String username = "";

        assertFalse(userValidator.validate(username));
    }

    @Test
    void validateNull() {
        UserValidator userValidator = new UserValidator();
        String username = null;

        assertFalse(userValidator.validate(username));
    }
}

package me.dbogda.lesson_test.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static me.dbogda.lesson_test.model.constants.UsersConstants.*;

class UserTest {

    private final User userTest = new User(CORRECT_EMAIL, CORRECT_LOGIN);
    private final User emptyUserTest = new User();

    @Test
    @DisplayName("checking email")
    void shouldTrowIncorrectArgumentExceptionWhenEmailIsIncorrect() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User(INCORRECT_EMAIL, CORRECT_LOGIN));
    }

    @Test
    @DisplayName("checking login")
    public void shouldTrowIncorrectArgumentExceptionWhenLoginIsIncorrect() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_EMAIL, INCORRECT_LOGIN));
    }

    @Test
    @DisplayName("the login is not equal to the email")
    public void shouldCheckThatLoginIsNotEqualToEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_EMAIL, LOGIN_EQUALS_EMAIL));
    }

    @Test
    @DisplayName("checking that the user is not null")
    public void shouldCheckUserIsNotEmpty() {
        Assertions.assertNull(emptyUserTest.getEmail());
        Assertions.assertNull(emptyUserTest.getLogin());
    }
}
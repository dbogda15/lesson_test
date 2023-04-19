package me.dbogda.lesson_test.model;

import java.util.Objects;

public class User {
    private String email;
    private String login;

    public User() {
    }

    public User(String email, String login) {

        if (email.contains("@") && email.contains(".")) {
             this.email = email;
        }
        else throw new IllegalArgumentException("Please, check your email! The email must contain an @ and a domain!");

        if (!login.equals(email)) {
            this.login = login;
        }
        else throw new IllegalArgumentException("Please, check your login! Login cannot be equal to email!");
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, login);
    }
}

package com.example.magazin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    @Test
    public void testCheckAgeValid() {
        User user = new User("John", 25, "Password123");
        assertTrue(user.checkAge());
    }

    @Test
    public void testCheckAgeInvalid() {
        User user = new User("Jane", 15, "P@ssw0rd");
        assertFalse(user.checkAge());
    }

    @Test
    public void testCheckPasswordValid() {
        User user = new User("Alice", 30, "SecureP@ss");
        assertTrue(user.checkPassword());
    }

    @Test
    public void testCheckPasswordInvalid() {
        User user = new User("Bob", 40, "weak");
        assertFalse(user.checkPassword());
    }
}

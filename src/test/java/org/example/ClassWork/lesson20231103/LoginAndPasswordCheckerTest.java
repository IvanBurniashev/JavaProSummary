package org.example.ClassWork.lesson20231103;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginAndPasswordCheckerTest {
    static LoginAndPasswordChecker checker;

    @BeforeAll
    public static void init() {
        checker = new LoginAndPasswordChecker();
    }

    @Test
    public void checkLogin() {
        assertTrue(checker.checkLoginAndPassword("john", "123", "123"));
    }

    @Test
    public void checkPassword() {
        assertTrue(checker.checkLoginAndPassword("john", "123", "123"));
    }

    @Test
    public void checkСonfirmPassword(){

    }

}
package com.company.Operations;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsageTest {
    String userPassword = "Password";
    @Test
    public void getUserName() {
    }

    @Test
    public void setUserName() {
    }

    @Test
    public void getUserPassword() {
    }

    @Test
    public void setUserPassword() {

        String validatePassword = userPassword;
            if (validatePassword.equals("Password")) {
                this.userPassword = userPassword;
            } else System.out.println("password maybe, please try again");
            System.out.println("User authenticated");
            //assertEquals();

    }
}
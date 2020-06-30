package com.company.Operations;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsageTest {
    public String userName = "Test";
    public String userPassword = "Password";
    public String logPath = "logFile";
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


    @Test
    public void testSetUserName() {
    }


    @Test
    public void testSetUserPassword() {
    }

    @Test
    public void statistics(String logPath) {
        this.logPath = logPath;
    }
}
package com.company.Operations;
//import java.net.Authenticator;
//userLogin


public class Usage {


        public String userName;
        public String userPassword;
        public String logPath = "logFile";

        public  Usage(String userName, String userPassword) {

            this.userName = userName;
            this.userPassword = userPassword;
        }

        public String getUserName() {
            return userName;
        }

    public void setUserName(String userName) {
        String validateUserName = userName;
        if (validateUserName.equals("Test") || validateUserName.equals("")) {
            this.userPassword = userPassword;
        } else System.out.println("User not found, please try again");
        this.userName = userName;
    }

    public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            String validatePassword = userPassword;
            //Blank validation for testing the
            if (validatePassword.equals("Password") || validatePassword.equals(""))  {
                this.userPassword = userPassword;
            } else System.out.println("User not found, please try again");{
            }
            this.userPassword = userPassword;
        }

    //method not complete to search for the logs in the date file - sc
    public void departmentSearchLog(String logPath) {
        this.logPath = logPath;
    }

    //methods not complete to get the auditor logs for statistics - sc
    public void resultsLog(String logPath) {
            this.logPath = logPath;
    }

}

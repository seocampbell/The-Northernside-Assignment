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
        String validateuserName = userName;
        if (validateuserName.equals("Test")) {
            this.userPassword = userPassword;
        } else System.out.println("User not found, please try again");
        this.userName = userName;
    }

    public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            String validatePassword = userPassword;
            if (validatePassword.equals("Password")) {
                this.userPassword = userPassword;
            } else System.out.println("User not found, please try again");{
            }
            this.userPassword = userPassword;
        }

        public void statistics(String logPath) {
            this.logPath = logPath;
    }

}

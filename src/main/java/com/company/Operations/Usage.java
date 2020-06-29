package com.company.Operations;
//import java.net.Authenticator;
//userLogin

public class Usage {


        public String userName;
        public String userPassword;

        public  Usage(String userName, String userPassword) {

            this.userName = userName;
            this.userPassword = userPassword;
        }

        public String getUserName() {
            return userName;
        }

    public void setUserName(String userName) {
        String validatePassword = userPassword.toLowerCase();
        if (validatePassword.equals("Test")) {
            this.userPassword = userPassword;
        } else System.out.println("User not found, please try again");
        this.userName = userName;
    }

    public String getUserPassword() {
            return userPassword;
        }
        //commented out the user authentication to make using the app accessible for the assignment -
        // you can see this working in the test coverage
        public void setUserPassword(String userPassword) {
            String validatePassword = userPassword;
            if (validatePassword.equals("Password")) {
                this.userPassword = userPassword;
            } else System.out.println("User not found, please try again");{
                System.exit(0);
            }
            this.userPassword = userPassword;
        }

}

package com.company.Json;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class Users {

    private String assetNumber;

    //WelcomeMessage screen
    public void welcomeMessage() {
        System.out.println("\nWelcome to the Asset Register. \n " +
                "\nTo login, please enter your UserName and Password\n");
    }

    public void departmentOptions() {
        System.out.println("Please select one of the following options\n"
                + "1 - IT Team\n"
                + "2 - Admin Team\n"
                + "3 - Instructions");
    }

    //Read me option for instructions - not complete - sc
    public void readMe() {
        System.out.println("Welcome to the Asset Management System \n" +
                "The Asset Management Registry has been set up to search from  \n" +
                "Read me");
    }

    //Message for the asset search option message
    public void searchCriteria() {
        System.out.println("Please select one of the " +
                "following options to view the User or Asset details. \n"
                + "1 - Users Details\n"
                + "2 - Systems Details");
    }

    //Message to enter the TNS number
    public void assetSearch() {
        System.out.println("Please enter a valid TNS Asset Number, " +
                "please include the TNS");
    }

    public String getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber(String assetNumber) {
        String validateAsset = assetNumber;
        if (validateAsset.contains("TNS")) {
            this.assetNumber = assetNumber;
        } else {
            System.out.println("The TNS number was missing, or the field was left blank.");
            assetNumber = "";
        }
    }
}



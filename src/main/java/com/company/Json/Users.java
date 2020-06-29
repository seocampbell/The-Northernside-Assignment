package com.company.Json;

public class Users {

    public String AssetNumber;

    //WelcomeMessage screen
    public void welcomeMessage(){
        System.out.println("\nWelcome to the Asset Register. \n " +
        "\nTo login, please enter your UserName and Password\n");
    }

    public void departmentOptions(){
        System.out.println("Please select one of the following options\n"
                + "1 - IT Team\n"
                + "2 - Admin Team");
    }
    //Read me option for instructions
    public void readMe(){
        System.out.println("Welcome to the Asset Management System \n" +
                "Read me \n" +
                    "Read me");
    }
    //Asset search option message
    public void searchCriteria(){
        System.out.println("Please select one of the " +
                "following options to view the User or Asset details. \n"
                + "1 - Users Details\n"
                + "2 - Systems Details");
    }

    public String getAssetNumber() {
        return this.AssetNumber;
    }
    //Constructor set up for get the  Asset Number from the search - SC
    public Users(String assetNumber) {
        this.AssetNumber = assetNumber;
    }

    public void setAssetNumber(String assetNumber) {
        this.AssetNumber = assetNumber;


    }
}



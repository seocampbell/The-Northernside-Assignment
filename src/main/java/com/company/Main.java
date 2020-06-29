package com.company;

import com.company.Json.*;
import com.company.Operations.Usage;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //comments to come - SC


        int teamSelection;

        Department selector = new Department("null", "null");
        Scanner scanner = new Scanner(System.in);
        JsonParser assetDetails = new JsonParser();
        Users welcome = new Users("null");
        Usage userAuthenticator = new Usage("null","null");

        //Welcome screen to present the user options - sc
        welcome.welcomeMessage();
        System.out.println("Username: (Username is Test)" );
        String userInput = scanner.nextLine();
        userAuthenticator.setUserName(userInput);
        System.out.println("Password: (Password is Password)");
        userInput = scanner.nextLine();
        userAuthenticator.setUserPassword(userInput);

        //Creating a loop to make sure only the available options are selected and correct file and department created - sc
        do {
            welcome.departmentOptions();
            teamSelection = scanner.nextInt();
            if (teamSelection == 1) {
                selector.setJsonFileName("src/IT_Assets.json");
            } else if (teamSelection == 2) {
                selector.setJsonFileName("src/Admin_Assets.json");
            } else System.out.println("Unfortunately, that is not one of the options\n");
        } while (teamSelection > 2);

        do {
            welcome.searchCriteria();
            teamSelection = scanner.nextInt();
            if (teamSelection == 1) {
                selector.setDepartmentSelector("staff");
            } else if (teamSelection == 2) {
                selector.setDepartmentSelector("assets");
            } else System.out.println("Unfortunately, that is not one of the options\n");
        } while (teamSelection > 2);

        //System.exit(0);

        assetDetails.assetList(selector.getDepartmentSelector(),selector.getJsonFileName());

        System.out.println("Please enter a valid TNS Asset Number");
        scanner.nextLine();//added as scanner was not picking up from the of int to string - sc

        //Input for the asset search - sc
        String selectNumber = scanner.nextLine();
        while(selectNumber.isEmpty()){
            System.out.println("The Asset Search was left empty.\n"
                + "Please enter a valid TNS Asset Number");
            selectNumber = scanner.nextLine();
        }
        System.out.println(selectNumber);
        //Call the Department > ItItems method - sc
        assetDetails.itItem(selectNumber);
        //Call the Department > itElements method - sc
        assetDetails.itElements();
        //Call the Department > itMappings method - sc
        assetDetails.itMapping();

        //close the scanner - sc
        scanner.close();

    }
}




package com.company;

import com.company.Json.*;
import com.company.Operations.Usage;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //comments to come - SC


        int teamSelection;
        String userInput;

        Department selector = new Department(null, null);
        Scanner scanner = new Scanner(System.in);
        JsonParser assetDetails = new JsonParser();
        Users welcome = new Users(null);
        Usage userAuthenticator = new Usage(null,null);

        //Welcome screen to present the user options - sc
        welcome.welcomeMessage();
        //loop to repeat the username entry until true
        do {
            //details set for prototype only - sc
            System.out.println("Username: (Username is Test)");
            userInput = scanner.nextLine();
            userAuthenticator.setUserName(userInput);
        }while (userInput.equals(true));

        //loop to repeat the username entry until true
        do {
            //details set for prototype only
            System.out.println("Password: (Password is Password)");
            userInput = scanner.nextLine();
            userAuthenticator.setUserPassword(userInput);
        }while (userInput.equals(true));

        //Creating a loop to make sure only the available options are selected and correct file and department to be selected - sc
        do {
            welcome.departmentOptions();
            teamSelection = scanner.nextInt();
            if (teamSelection == 1) {
                selector.setJsonFileName(teamSelection);
            } else if (teamSelection == 2) {
                selector.setJsonFileName(teamSelection);
            } else System.out.println("Unfortunately, that is not one of the options\n");
        } while (teamSelection > 2);

        //Creating a loop to make sure only the available options are selected and correct User or System details and selected - sc
        do {
            welcome.searchCriteria();
            teamSelection = scanner.nextInt();
            if (teamSelection == 1) {
                selector.setDepartmentSelector(teamSelection);
            } else if (teamSelection == 2) {
                selector.setDepartmentSelector(teamSelection);
            } else System.out.println("Unfortunately, that is not one of the options\n");
        } while (teamSelection > 2);

        //Call the first method in the JsonParser to set the locations - sc
        assetDetails.assetList(selector.getDepartmentSelector(),selector.getJsonFileName());

        //User to add a TNS number
        System.out.println("Please enter a valid TNS Asset Number, please include the TNS");
        scanner.nextLine();//added as scanner was not picking up from the of int to string - sc

        //Input for the asset search - sc
        String selectNumber = scanner.nextLine();
        while(selectNumber.isEmpty()){
            System.out.println("The Asset Search was left empty.\n"
                + "Please enter a valid TNS Asset Number");
            selectNumber = scanner.nextLine();
        }
        System.out.println(selectNumber);

        //Call the 2nd method in JsonParser - sc
        assetDetails.itItem(selectNumber);

        //Call the 3rd method in JsonParser - sc
        assetDetails.itElements();

        //Call the 4th method in JsonParser - sc
        assetDetails.itMapping();

        //close the scanner - sc
        scanner.close();

    }
}




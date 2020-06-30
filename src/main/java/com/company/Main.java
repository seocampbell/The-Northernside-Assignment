package com.company;

import com.company.Json.*;
import com.company.Operations.Usage;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //comments to come - SC


        int teamSelection;
        String userInput;
        String selectNumber;

        //Constructor created for the department and json file
        Department selector = new Department(null, null);
        Scanner scanner = new Scanner(System.in);
        JsonParser assetDetails = new JsonParser();
        //Constructor set for the user messages
        Users welcome = new Users();
        //Constructor set for the username and password
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
        welcome.assetSearch();
        scanner.nextLine();//added as scanner was not picking up from the of int to string - sc

        //Input for the asset search - sc
        selectNumber = scanner.nextLine();
        welcome.setAssetNumber(selectNumber);
        selectNumber = welcome.getAssetNumber();
        while(selectNumber==null||selectNumber.isEmpty()){
            System.out.println("Please re-enter a valid TNS Asset Number");
            selectNumber = scanner.nextLine();
        }
        //System.out.println(selectNumber);

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




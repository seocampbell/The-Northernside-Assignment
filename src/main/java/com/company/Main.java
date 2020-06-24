package com.company;

import com.company.Json.*;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Users itSelector = new Users();
        itSelector.setItSelector("staff");
       JsonParser employee = new JsonParser(){

           Scanner scanner = new Scanner(System.in);

           public Scanner getScanner() {
               scanner.nextLine();
               return scanner;
           }
       };

        System.out.println("\nWelcome to the Asset Register.  \n"
                + "Please search on the following option\n"
                + "1 - IT Team\n"
                + "2 - Admin Team");
        String teamSelection = scanner.nextLine();
        if (teamSelection.equals("1"));
        {
            System.out.println("Would you like to search the Asset or Staff register\n"
            + "Please select\n 1. Staff Search \n 2. Asset Search ");
            String searchSelection = scanner.nextLine();
            if (searchSelection.equals("1")) {
                employee.assetList("staff");
            }  employee.assetList("assets");{
            System.out.println("No select number");
            }

            System.out.println("\nPlease Enter the TNS Asset No. \n");
            String selectNumber = scanner.nextLine();
            employee.itItem(selectNumber);
            employee.itElements();
            employee.itMapping();
        }

    }

}




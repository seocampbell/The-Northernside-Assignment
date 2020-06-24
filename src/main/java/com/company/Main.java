package com.company;

import com.company.Json.*;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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
            System.out.println("\nPlease Enter the TNS Asset No. \n");
            String selectNumber = scanner.nextLine();
            employee.itItem(selectNumber);
            employee.itElements();
            employee.itMapping();
        }





    }

}



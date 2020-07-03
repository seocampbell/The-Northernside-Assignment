package com.company.Json;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {


    int jsonSelector = 1;
    String departmentSelector = "staff";
    String jsonFileName = "src/IT_Assets.json";;

    @Test
    public void setDepartmentSelector() {
        int validateResource = jsonSelector;
        if (validateResource == 1) {
            this.departmentSelector = "staff";
        } else if (validateResource == 2) {
            this.departmentSelector = "staff";
        } else System.out.println("Error, the department has not been expected, please check.");
        assertEquals(this.departmentSelector, departmentSelector);
        System.out.println("Pass: " + this.departmentSelector);
    }

    @Test
    public void getDepartmentSelector() {
        System.out.println(departmentSelector);
        assertEquals(this.departmentSelector,departmentSelector);
        System.out.println("Pass: " + this.departmentSelector);
    }

    @Test
    public void getJsonFileName() {
        System.out.println(jsonFileName);
        assertEquals(this.jsonFileName,jsonFileName);
        System.out.println("Pass: " + jsonFileName);
    }

    @Test
    public void setJsonFileName() {
        int validateLocation = jsonSelector;
        if (validateLocation==1) {
            this.jsonFileName = "src/IT_Assets.json";
        } else if(validateLocation==2)
        { this.jsonFileName = "src/Admin_Assets.json";
        }else System.out.println("Error! The file location is incorrect!");
        assertEquals(this.departmentSelector, departmentSelector);
        System.out.println("Pass: " + this.jsonFileName);

    }
}

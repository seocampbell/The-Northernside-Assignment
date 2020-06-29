package com.company.Json;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {
    String jsonFileName = "src/IT_Assets.json";
    String departmentSelector = "staff";

    @Test
    public void setDepartmentSelector() {
        String ValidateResource = departmentSelector;
        if (ValidateResource.equals("staff") ||
                ValidateResource.equals("assets")) {
            this.departmentSelector = departmentSelector;
        } else System.out.println("Error, the department has not been expected, please check.");
    }

    @Test
    public void getDepartmentSelector() {
    }

    @Test
    public void getJsonFileName() {
    }

    @Test
    public void setJsonFileName() {
        String ValidateLocation = jsonFileName;
        if (ValidateLocation.equals("src/IT_Assets.json") ||
                ValidateLocation.equals("src/Admin_Assets.json")) {
            this.jsonFileName = jsonFileName;
        } else System.out.println("Error! The file location is incorrect!");
    }
}
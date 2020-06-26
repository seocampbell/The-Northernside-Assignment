package com.company.Json;

public class Department {

    private String departmentSelector;
    public String jsonFileName;

    public void setDepartmentSelector(String departmentSelector) {
        String ValidateResource = departmentSelector;
        if (ValidateResource.equals("staff") ||
                ValidateResource.equals("assets")) {
            this.departmentSelector = departmentSelector;
        } else System.out.println("Error, the department has not been expected, please check.");
    }


    public String getDepartmentSelector() {
        return this.departmentSelector;
    }

    public String getJsonFileName() {
        return jsonFileName;
    }

    public void setJsonFileName(String jsonFileName) {
        String ValidateLocation = jsonFileName;
        if (ValidateLocation.equals("src/IT_Assets.json") ||
                ValidateLocation.equals("src/Admin_Assets.json")) {
            this.jsonFileName = jsonFileName;
        } else System.out.println("Error! The file location is incorrect!");
    }

    public Department(String departmentSelector, String jsonFileName) {
        this.departmentSelector = departmentSelector;
    }


}
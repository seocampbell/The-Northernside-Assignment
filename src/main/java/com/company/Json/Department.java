package com.company.Json;

public class Department {

    private String departmentSelector;
    public String jsonFileName;


    public void setDepartmentSelector(int departmentSelector) {
        int ValidateResource = departmentSelector;
        if (ValidateResource==1) {
            this.departmentSelector = "staff";
        } else if(ValidateResource==2)
        { this.departmentSelector = "staff";
        } else System.out.println("Error, the department has not been expected, please check.");
    }

    public String getDepartmentSelector()
    {
        return this.departmentSelector;
    }

    public String getJsonFileName()
    {
        return this.jsonFileName;
    }
    public void setJsonFileName(int jsonSelector) {
        int validateLocation = jsonSelector;
        if (validateLocation==1) {
          this.jsonFileName = "src/IT_Assets.json";
        } else if(validateLocation==2)
        { this.jsonFileName = "src/Admin_Assets.json";
        }else System.out.println("Error! The file location is incorrect!");

    }
    public Department(String departmentSelector, String jsonFileName)
    {
        this.departmentSelector = departmentSelector;
    }


}
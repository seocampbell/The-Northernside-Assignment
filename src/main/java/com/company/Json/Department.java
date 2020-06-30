package com.company.Json;

public class Department {

    private String departmentSelector;
    public String jsonFileName;

    //From the main selector, the setter will validate the user choice - sc
    public void setDepartmentSelector(int departmentSelector) {
        int ValidateResource = departmentSelector;
        if (ValidateResource==1) {
            this.departmentSelector = "staff";
        } else if(ValidateResource==2)
        { this.departmentSelector = "assets";
        } else System.out.println("Error, please check your selection and try again.");
    }

    public String getDepartmentSelector()
    {
        return this.departmentSelector;
    }

    public String getJsonFileName()
    {
        return this.jsonFileName;
    }
    //From the main selector, the setter will validate the user choice and set the location of the file - sc
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
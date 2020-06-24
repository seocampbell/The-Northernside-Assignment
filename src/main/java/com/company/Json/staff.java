package com.company.Json;

public class staff {
    private String id;
    private String name;
    private String department;
    private boolean server_admin;

    public staff(String id,String name,String department,boolean server_admin){
        this.id = id;
        this.name = name;
        this.department = department;
        this.server_admin = server_admin;
    }
}
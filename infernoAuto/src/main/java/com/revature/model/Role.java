package com.revature.model;

public enum Role {
    USER, ADMIN, EMPLOYEE, GUEST;

    //get
    public String getRole(int role){
        switch(role){
            case 1:
                return "USER";
            case 2:
                return "ADMIN";
            case 3:
                return "EMPLOYEE";
            case 4:
                return "GUEST";
            default:
                return "";
        }
    }
}

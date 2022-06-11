package com.revature.model;

public enum Role {
    CUSTOMER, EMPLOYEE, GUEST;

    //get
    public String getRole(int role){
        switch(role){
            case 1:
                return "CUSTOMER";
            case 2:
                return "EMPLOYEE";
            case 3:
                return "GUEST";
            default:
                return "";
        }
    }
}

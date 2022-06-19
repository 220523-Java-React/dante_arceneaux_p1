package com.revature.model;

public enum Role {
    CUSTOMER, EMPLOYEE, GUEST, USER;

    //get
    public static String getRole(int role){
        switch(role){
            case 1:
                return "USER";
            case 2:
                return "EMPLOYEE";
            case 3:
                return "GUEST";
            default:
                return "";
        }
    }
}

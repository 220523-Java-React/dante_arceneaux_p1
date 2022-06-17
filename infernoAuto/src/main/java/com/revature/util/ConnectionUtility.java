package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {

    private static Connection instance; //create a static instance of the connection
    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private final static String user = "postgres";
    private final static String password = "Ch3ss75!9";

    /**
     JDBC API
     Java DataBase Connectivity
     Has all the interfaces and objects that we need in our app to work with a database

     We will bring in a Postgres driver that will satisfy the implementation
     */
    public static Connection getConnection() throws SQLException{

        if(instance == null || instance.isClosed()){ // we have not yet created a connection

//            Class.forName("org.postgresql.Driver");
            instance = DriverManager.getConnection(url, user, password);
        }
        return instance;
    }

    private ConnectionUtility(){

    }
}
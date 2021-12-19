package util;

import java.sql.*;


public class dbconnection {
public  static Connection getConnection() throws SQLException {
    
    Connection conn=null;    
    
    try{
        conn =  DriverManager.getConnection("jdbc:mysql://localhost/apmdb","root","");

        if(conn != null){
            System.out.println("Connected Successfully");

        }
        else{
            System.out.println("Failed to Connect");
        }
    }
    catch(Exception e){
    
        System.err.println(e);
        
    }
    return conn;
    }
    
}



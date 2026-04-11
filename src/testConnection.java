package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class testConnection{
    public static void main(String[] args) throws SQLException {
        String URL="jdbc:mysql://localhost:3306/testdb";
        String user="root";
        String password="root";

        Connection conn=DriverManager.getConnection(URL, user, password);
        if(conn==null){
            System.out.println("Connection is not successfull");
        }
        else{
            System.out.println("Connected Successfully");
        }
        
    }
}
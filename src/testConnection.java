package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.SQLException;

class testConnection{
    public static void main(String[] args) throws SQLException {
        // ---------------New Method-------------------------
        // String URL="jdbc:mysql://localhost:3306/testdb";
        // String user="root";
        // String password="root";

        // Connection conn=DriverManager.getConnection(URL, user, password);
        // if(conn==null){
        //     System.out.println("Connection is not successfull");
        // }
        // else{
        //     System.out.println("Connected Successfully");
        // }
        // ----------------Old MEthod-----------------------
        //Step 1 Creating Driver class object
        Driver driver=new com.mysql.cj.jdbc.Driver();
        //Step2 Registering it with the driver class manager
        DriverManager.registerDriver(driver);
        //step3 Establis connection
        String URL="jdbc:mysql://localhost:3306/testdb";
        String user="root";
        String password="root";
        Connection conn=DriverManager.getConnection(URL, user, password);
        if(conn==null){
            System.out.println("Connection Unsuccessfull");
        }
        else{
            System.out.println("Connection Unsuccessfull");
            conn.close();
        }

        
    }
}
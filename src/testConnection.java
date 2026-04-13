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

        //Instead of these two lines
        //Line 1 - Driver driver=new com.mysql.cj.jdbc.Driver();
        //Line 2 - DriverManager.registerDriver(driver);
        // we can write a single line as 
        // Class.forName(com.mysql.cj.jdbc.Driver);
        // In the backend of Class.forName both the lines (Line 1 and Line 2) are present in the static block so as when we call the static method (forName) (Line 1 and Line 2) automatically gets executed.
        
    }
}

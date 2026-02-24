package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
    Connection connection;
    Statement statement;

    public DBConnection(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelMS", "root","timm22");
            statement=connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

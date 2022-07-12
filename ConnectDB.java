package Basics;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

    private static String url="jdbc:postgresql://localhost:5432/postgres";
    private static String username="postgres";
    private static String password="1Chomiczek";

    public static Connection Connect(){
        Connection connection=null;
        try {
             connection= DriverManager.getConnection(url,username,password);

            if(connection!=null){
                System.out.println("Connected");
            }else{
                System.out.println("Not connected");
            }
        }catch(Exception e){
            System.out.println(e);

        }
        return connection;

    }

}

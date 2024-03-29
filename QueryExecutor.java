package Basics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecutor {
    public static ResultSet executeSelect(String selectQuery){
        try {
            Connection connection = ConnectDB.Connect();
            Statement statement=connection.createStatement();
            return statement.executeQuery(selectQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void executeQuery(String query){
        try{
            Connection connection=ConnectDB.Connect();
            Statement statement=connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

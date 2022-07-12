package Basics;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class MultiQueries {

    public static void executeQuery(String query) {
        try {
            Connection connection = ConnectDB.Connect();
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void executeQuery(String query, Connection connection) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void executeQueries(List <String> queries) {
        queries.forEach(QueryExecutor::executeQuery);
    }

    public static void executeQueriesInOneTransaction(List <String> queries) throws SQLException {
        Connection connection = ConnectDB.Connect();
        connection.setAutoCommit(false);
        queries.forEach(query -> executeQuery(query,connection));
        connection.commit();
        connection.close();

    }

}

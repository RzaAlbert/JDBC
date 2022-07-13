package Basics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        /*try {
            ResultSet result = CommandExecutor.executeSelect("SELECT * FROM \"Pracownicy\"");
            result.next();
            String id = result.getString("ID");
            System.out.print("Dane z bazy: ID=" + id);
            String age = result.getString("Age");
            System.out.print(" Age=" + age);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        QueryExecutor.executeQuery("INSERT INTO public.\"Pracownicy\"(\"ID\",\"Age\") VALUES (10,25)");
        QueryExecutor.executeQuery("UPDATE public.\"Pracownicy\" SET \"Age\"=999 WHERE \"ID\"=1");
        */


        //QueryExecutor.executeQuery("INSERT INTO public.\"Pracownicy\"(\"USER_ID\", \"USER_NAME\", \"ACCOUNT_BALANCE\")VALUES (2, 'Piotr', 1000)");


       



    }
}





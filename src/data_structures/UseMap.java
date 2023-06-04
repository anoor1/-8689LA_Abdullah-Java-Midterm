package data_structures;

import databases.SharedStepsDatabase;

import java.sql.*;
import java.util.*;

public class UseMap {

    /** INSTRUCTIONS
     *

     Implement code to demonstrate how to interact with a database connection, using a Map
     You must insert the map into a table, and then you must submit & execute a query to retrieve
     all the submitted data (retrieval does not need to be stored as a map - you can use any data structure)*
     Use For-Each loop and While-loop with Iterator to retrieve data.
     */

    private static Properties prop;
    private static Connection connection;

    public static void main(String[] args) throws Exception {

        HashMap<Object, Object> map = new HashMap<>();
        map.put(8454, "lamia");
        map.put(4567, "azar");
        map.put(7898, "rahim");

        // Retrieving "Keys" & "Values" using an Iterator
        Iterator<Object> mapIter = map.keySet().iterator();
        Object key;
        while (mapIter.hasNext()) {
            key = mapIter.next();
            System.out.println("KEY: " + key);
            System.out.println("VALUE: " + map.get(key));
        }

        String tableName = "Employees";
        SharedStepsDatabase sql = new SharedStepsDatabase();

    }
    // IMPLEMENT HERE
    static class SharedStepsDatabase {
        //using mySQL to retrieve data from the world table
        private String url = "jdbc:mysql://localhost/world?serverTimezone=UTC&useSSL=false";
        private String username = "root";
        private String password = "Xmwy9999!";

        public void insertData(String tableName, HashMap<Object, Object> map) {
            try {
                connection = DriverManager.getConnection(url, username, password);
                String insertQuery = "INSERT INTO " + tableName + " (key_column, value_column) VALUES (8454, \"lamia\")";
                PreparedStatement statement = connection.prepareStatement(insertQuery);
                for (Map.Entry<Object, Object> entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    statement.setObject(1, key);
                    statement.setObject(2, value);
                    statement.executeUpdate();
                }

                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}


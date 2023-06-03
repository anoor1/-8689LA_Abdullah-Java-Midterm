package data_structures;
import java.util.Iterator;
import java.util.LinkedList;
import java.sql.*;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList (LinkedList) that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {

        // Using add method to create an Arraylist
        LinkedList<String> fruitList = new LinkedList<>();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Blueberry");

        System.out.println("LinkedList: " + fruitList);

        // The remove method removes the first element
        fruitList.remove();
        System.out.println("LinkedList after removing the first element: " + fruitList);

        // The Retrieve method retrieves the first element at a specific index
        String elementAtIndex = fruitList.get(1);
        System.out.println("The element at index 1 is: " + elementAtIndex);

        // the peek method retrieves the first element without removing it
        String firstElement = fruitList.peek();
        System.out.println("First element: " + firstElement);


        // Use for-each loop to retrieve elements from the LinkedList
        System.out.println("Retrieving elements using for-each loop:");
        for (String element : fruitList) {
            System.out.println(element);
        }

        // Use while loop and iterator to retrieve elements from the LinkedList
        System.out.println("Retrieving elements using while loop and iterator:");
        Iterator<String> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);


            // Connect to the database
            String url = "jdbc:mysql://localhost/world?serverTimezone=UTC&useSSL=false";
            String username = "root";
            String password = "Xmwy9999!";

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                // Create a new LinkedList
                LinkedList<String> employeeNames = new LinkedList<>();

                // Retrieve data from the database table and store it in the LinkedList
                String query = "SELECT* FROM WORLD.CITY LIMIT 10";
                try (Statement statement = connection.createStatement();
                     ResultSet resultSet = statement.executeQuery(query)) {
                    while (resultSet.next()) {
                        String name = resultSet.getString("name");
                        employeeNames.add(name);
                    }
                }

                // Print the retrieved employee names
                System.out.println("Employee Names:");
                for (String name : employeeNames) {
                    System.out.println(name);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
        }



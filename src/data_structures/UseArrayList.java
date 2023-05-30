package data_structures;

import java.util.ArrayList;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {

        // Using add method to create an Arraylist
        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Blueberry");

        // Using remove method to remove an element from the arraylist
        fruitList.remove("Blueberry");
        System.out.println(fruitList);

        // Retrieving the element "Apple" using the get method, which is in index 1
        System.out.println(fruitList.get(1));

        // the peek method shows the first element in queue, which is Mango
        //  int x = (fruitList);
        // System.out.println(peek(fruitList));

    }

}

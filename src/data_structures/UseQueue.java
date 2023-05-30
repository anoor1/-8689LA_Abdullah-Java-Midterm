package data_structures;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Toyota"); // Add method. Adds elements to a queue
        queue.add("Honda");
        queue.add("BMW");

        queue.peek(); //peek method. Shows the first element in queue, which is Toyota
        System.out.println(queue);

        String x = queue.poll(); // poll method. Retrieve and removes the first element, Toyota
        System.out.println(queue);

        queue.remove(); // Remove method. Removes the first element in the queue list, BMW
        System.out.println(queue);
    }

}

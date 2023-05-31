package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String sentence = "Java is a programming language. Java is also an Island of Indonesia. Java is widely used in industry.";
        findDuplicateWords(sentence);
    }

    public static void findDuplicateWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create a HashMap to store word occurrences
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Iterate through each word
        for (String word : words) {
            // Check if the word already exists in the map
            if (wordCountMap.containsKey(word)) {
                // If it exists, increment the count
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                // If it doesn't exist, add it to the map with count as 1
                wordCountMap.put(word, 1);
            }
        }

        // Print duplicate words and their occurrences
        System.out.println("Duplicate words and their occurrences:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        // Calculate the average length of all words
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        double averageLength = (double) totalLength / words.length;

        System.out.println("Average length of words: " + averageLength);
    }
}



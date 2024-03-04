import java.util.*;
import java.io.*;

public class assignment13 {
    public static void main(String[] args) throws Exception {
        
        Scanner scnr = new Scanner(System.in);
        System.out.print("please enter the name of the text file: ");
        String fileName = scnr.nextLine();
        Scanner input = new Scanner(new File(fileName));

        
        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            if (!wordCounts.containsKey(next)) {
                wordCounts.put(next, 1);
            } else {
                wordCounts.put(next, wordCounts.get(next) + 1);
            }
        }

        
        System.out.println("Total words = " + wordCounts.size());
        
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            System.out.println( word + " " + count );
            
        }
    }
}
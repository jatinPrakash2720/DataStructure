import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
// import java.util.concurrent.ArrayBlockingQueue;
import java.util.Set;

public class Feb06 {

    public static int countConsistentStyrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }
        return count;
    //    Set<Character> allowedSet = new HashSet<>();
    //     for (char c : allowed.toCharArray()) {
    //         allowedSet.add(c);
    //     }

    //     int count = 0; // Count of consistent strings

    //     // Check each word in words array
    //     for (String word : words) {
    //         boolean isConsistent = true;

    //         // Check if all characters in the word are allowed
    //         for (char c : word.toCharArray()) {
    //             if (!allowedSet.contains(c)) {
    //                 isConsistent = false;
    //                 break;
    //             }
    //         }

    //         if (isConsistent) {
    //             count++; // Increment count if the word is consistent
    //         }
    //     }

    //     return count; 
    }
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        System.out.println(countConsistentStyrings(allowed, words));
        
    }
}

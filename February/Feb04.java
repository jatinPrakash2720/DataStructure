import java.util.HashSet;
import java.util.Hashtable;

public class Feb04 {
    public static int finalValueAfterOperations(String[] operations) {
        // int opLen = operations.length;
        int x = 0;
        // Character[] op = new Character[opLen];
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                x = x + 1;
                // System.out.println(x);
                // op[i] = 'a';
            }

            if (operations[i].equals("--X")||operations[i].equals("X--")) {
                x = x - 1;
                // System.out.println(x);
                // op[i] = 'c';
            }

        }
        return x;
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        for (int i = 0; i < morseCode.length; i++) {
            hashtable.put(i + 97, morseCode[i]);
        }
    
        for (int i = 0; i < words.length; i++) {
            String str = "";
            for (char ch : words[i].toCharArray()) {
                int val = ch - 0;
                str = str + hashtable.get(val);
            }
            words[i] = str;
        }
        HashSet<String> uniqueSet = new HashSet<>();

        // Add each element from the array to the HashSet
        for (String element : words) {
            uniqueSet.add(element);
        }
        return uniqueSet.size();
//         import java.util.HashMap;
// import java.util.HashSet;

// class Solution {
//     public int uniqueMorseRepresentations(String[] words) {
//         String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
//                 "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

//         // HashSet to store unique Morse code transformations
//         HashSet<String> uniqueSet = new HashSet<>();

//         // Convert each word into its Morse code representation
//         for (String word : words) {
//             StringBuilder morseString = new StringBuilder();
//             for (char ch : word.toCharArray()) {
//                 morseString.append(morseCode[ch - 'a']); // Direct indexing
//             }
//             uniqueSet.add(morseString.toString()); // Add to HashSet
//         }

//         return uniqueSet.size(); // Return the number of unique transformations
//     }
// }

    }

    public static void main(String[] args) {
        String[] words = { "gin", "zen", "gig", "msg" };
        // System.out.println(uniqueMorseRepresentations(words));
        String[] operations = { "--X", "X++", "X++" };
        System.out.println(finalValueAfterOperations(operations));
    }
}

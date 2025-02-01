import java.util.*;

public class Jan10 {
    public static List<Character> generateCharArr(String[] words2) {
        // int size =0;
        // for (String str : words2) {
        //     size = size + str.length();
        // }
        List<Character> charA= new ArrayList<>();
        for (String str : words2) {
            for (int i = 0; i < str.length(); i++) {
                charA.add(str.charAt(i));
            }
        }
        return charA;
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> op = new ArrayList<>();
        for (String st : words1) {
            if (isUniversal(st, words2)) {
                op.add(st);
            }
        }
        return op;
    }

    public static boolean isUniversal(String st, String[] words2) {
        List<Character> words2C = generateCharArr(words2);
        for (char ch : words2C) {
            if (st.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
        // for (String str : words2) {
        //     for (char ch : str.toCharArray()) {
        //         if (st.indexOf(ch) != 1) {
                    
        //         }
        //     }

        // }
        // return true;
    }

    public static void printList(List<String> list) {
        for (String str : list) {
            System.out.println(str+" ");
        }
    }

    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"lo","eo"};
        printList(wordSubsets(words1, words2));
        
    }
}
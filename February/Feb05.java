import java.util.ArrayList;
import java.util.List;

public class Feb05 {
    public static boolean containsChar(String word, char x) {
        for (char ch : word.toCharArray()) {
            if (ch == x) {
                return true;
            }
        }
        return false;
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> opList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (containsChar(words[i], x)) {
                opList.add(i);
            }
        }
        // for (int i : opList) {
        //     System.out.println(i);
        // }
        return opList;
    }
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'z';
        findWordsContaining(words, x);


    }
}

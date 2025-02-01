import java.util.ArrayList;
import java.util.List;

public class File {
    public static void main(String[] args) {
        printResult();

    }

    public static List<Character> generateCharArr(String[] words2) {
        // int size =0;
        // for (String str : words2) {
        //     size = size + str.length();
        // }
        List<Character> charA = new ArrayList<>();
        for (String str : words2) {
            for (int i = 0; i < str.length(); i++) {
                charA.add(str.charAt(i));
            }
        }
        return charA;
    }

    // public static List<String> wordSubsets(String[] words1, String[] words2) {
    //     List<String> op = new ArrayList<>();
    //     for (String st : words1) {
    //         if (isUniversal(st, words2)) {
    //             op.add(st);
    //         }
    //     }
    //     return op;
    // }
    public static void printResult() {
    System.out.println("Happy Birthday, Bhai");
    System.out.println("Bhul gya tha !");
}
}

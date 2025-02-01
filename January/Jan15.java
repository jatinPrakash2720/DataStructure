import java.util.*;
public class Jan15 {
    class MinimizeXor {
        public static int countSetBits(int number) {
            return Integer.bitCount(number);
        }
        public static StringBuilder minimizeXor(int num1, int num2) {
            int avaliableChances = countSetBits(num2);
            int lastModification = -1;
            String str = Integer.toBinaryString(num1);
            StringBuilder str1 = new StringBuilder(str);
            // String str = String.getBits(num1);
            StringBuilder output = new StringBuilder(); 
            // List<Character> output = new ArrayList<>();
            for (int i = str.length() - 1; i >= 0; i--) {
                if (avaliableChances != 0 && str.charAt(i) != '0') {
                    output.append('0');
                    avaliableChances--;
                    lastModification += 1;
                } else if (str.charAt(i) != '1') {
                    output.append('0');
                }
            }
            return output;
        }
    }
    public static void main(String[] args) {
        // List<Character> output = new ArrayList<>();
        // output.add('0');
        // output.add('1');
        // output.add('2');
        // StringBuilder str = new StringBuilder();
        // str.append('0');
        // str.append('1');
        // str.append('2');
        // System.out.println(str);
        System.out.println(MinimizeXor.minimizeXor(1,12));
    }
    
    
}

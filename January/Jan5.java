// Problem statement
// You are given a number ’n’.



// Find the number of digits of ‘n’ that evenly divide ‘n’.



// Note:
// A digit evenly divides ‘n’ if it leaves no remainder when dividing ‘n’.


// Example:
// Input: ‘n’ = 336

// Output: 3

// Explanation:
// 336 is divisible by both ‘3’ and ‘6’. Since ‘3’ occurs twice it is counted two times.
// Note:
// You don’t need to print anything. Just implement the given function.

public class Jan5 {
    public static int getDiv(int n) {
        int count = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - '0';
            if (a == 0) {
            continue;
            }
            if (n % a == 0) {
                count++;
            }
                
        }
        return count;
    }
    public static int getCount(int N) {
        return Integer.toString(N).length();
    }

    public static void main(String[] args) {
        System.out.println(getDiv(660));
    }
}
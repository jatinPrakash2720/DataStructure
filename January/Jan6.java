public class Jan6 {
    public static boolean isRev(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }

    int reversedHalf = 0;

    // Reverse the second half of the number
    while (x > reversedHalf) {
        int digit = x % 10;          // Extract the last digit
        reversedHalf = reversedHalf * 10 + digit; // Add it to the reversed half
        x = x / 10;                  // Remove the last digit from x
    }

    // Check if the first half matches the reversed second half
    // For odd-length numbers, ignore the middle digit (reversedHalf / 10)
    return x == reversedHalf || x == reversedHalf / 10;
    }
    public static int getRev(int x) {
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return 0;

        boolean isNeg = false;
        if (x < 0) {
            x = -x;
            isNeg = true;
        }
        int ans = 0;
        while (x > 0) {
            int digit = x % 10;
            ans = ans * 10 + digit;
            x = x / 10;
            
        }
        return isNeg ? -ans : ans;
    }
    public static void main(String[] args) {
        System.out.println(getRev(563847412));
    }
}
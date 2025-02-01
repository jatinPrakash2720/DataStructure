public class Jan11 {
    public static boolean canConstruct(String s, int k) {
        // int count = 0;
        // int n = s.length();
        // for (int i = n - 2; i >= 0; i--) {
        //     String tempStr = s.substring(i, n - 1);
        //     if (isPalindrome(tempStr)) {
        //         count++;
        //     }
        //     System.out.println(tempStr);
        // }
        // return true;
    }
    //annabella

    // public static boolean isPalindrome(String s) {
    //     StringBuilder str = new StringBuilder(s);
    //     String strRev = str.reverse().toString();
    //     return s.equals(strRev);
    //     // String s1 = s.toString();
    //     // String s2 = str.reverse().toString();
    //     // return s1.equals(s2);
    //     // return isRev(str);
    // }
    public static void main(String[] args) {
        canConstruct("annabelle",2);
    }
}

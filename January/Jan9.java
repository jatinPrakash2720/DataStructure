public class Jan9 {
    public static int myAtoi(String s) {
        String str = s.trim();
        int b = 0;
        boolean isNeg = false;
        int count = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (char a : str.toCharArray()) {
            if (a == '-' && count == 0) {
                isNeg = true;
                count = 1;
            } else {
                if (!(a >= '0' && a <= '9')) {
                    break;
                }
                if (b >= max&&!isNeg) {
                    System.out.println("runmax");
                    return max;
                }
                if (b <= min) {
                    System.out.println("runmin");
                    return min;
                }
                b = b + (a - '0');
                b *= 10;
            }
            
        }
        
        return isNeg ? -b/10 : b/10;
        
    } 

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        int n = pref.length();
        for (String str : words) {
            if (n > str.length()) {
                continue;
            }
            if (isPrefix(str, pref))
                count++;

            // if (pref.equals(str.substring(0, n))) {
            //     count++;
            // }
        }
        return count;
    }
    // for (char a : str.toCharArray()) {
        //     if (!((a >= '0' && a <= '9')||a=='-')) {
        //         // System.out.println("run break");
        //         break;
        //     }else if(a == '-'){
        //         // System.out.println("run-");
        //         isNeg = true;
        //     } else {
        //         b = b + (a - '0');
        //         // System.out.println(b);
        //         b *= 10;
        //     }
        // }
    public static boolean isPrefix(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        if (m > n) {
            return false;
        }
        for (int i = 0; i < m && i < n; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(String s) {
        StringBuilder str = removeNonAlphaNumAndUC(s);

        // StringBuilder str1 = str.reverse();


        String s1 = str.toString();
        String s2 = str.reverse().toString();
        return s1.equals(s2);
        // return isRev(str);
    }
    public static StringBuilder removeNonAlphaNumAndUC(String str) {
        StringBuilder strOP = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                strOP.append(ch);
            } else if ((ch >= 'A' && ch <= 'Z')) {
                ch = (char) (ch + 32);
                strOP.append(ch);
                // strOP.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(strOP);
        return strOP;
    }

    public static boolean isRev(StringBuilder str) {
        int n = str.length();
        if (n % 2 == 0) {
            for (int i = 0, j = n - 1; i < n / 2 && j > (n / 2) - 1; i++) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                j--;
            }
            
        } else {
            for (int i = 0, j = n - 1; i < n / 2 && j > n / 2; i++) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                j--;
            }
            
        }
        return true;
        
    }
// Uppercase Letters (A-Z): 65 to 90

// Lowercase Letters (a-z): 97 to 122

// Numbers (0-9): 48 to 57
    public static boolean isPrefixAndSuffix(String s1, String s2){
        int n1=s1.length();
        int n2=s2.length();
       
        if (!s1.equals(s2.substring(0, n1))) {
            return false;
        }
        if (!s1.equals(s2.substring(n2 - n1))) {
            return false;
        }
        return true;
    }
//  System.out.println(s1 +"," + s2.substring(0,n1));
        // System.out.println(s1 +", "+ s2.substring(n2-n1,n2-1));
        public static void main(String[] args) {
            // String[] words = {"leetcode","win","loops","success"};
            // String pref = "code";
            // System.out.println(prefixCount(words, pref));
            System.out.println(myAtoi("-91283472332"));
        }
    // amanaplanacanalpanama
    // amanaplanacanalpanama
}

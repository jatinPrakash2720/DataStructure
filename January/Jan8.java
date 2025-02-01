import java.util.Arrays;

public class Jan8 {
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

    public static boolean isSuffix(String str1, String str2) {
        int m = str1.length() - 1;
        int n = str2.length() - 1;
        if (m > n) {
            return false;
        }
        for (int i = m, j = n; i >= 0 && j >= 0; i--) {
            if (str1.charAt(i) != str2.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static boolean isPrefixAndSuffix(String str1, String str2) {
        return isPrefix(str1, str2) && isSuffix(str1, str2);
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int result = 0;
        int n = words.length;
        for (int i = 0; i < n- 1; i++) {
            for (int j = i + 1; j < n; j++)
                if (isPrefixAndSuffix(words[i], words[j])) {
                    result++;
                }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = { "abab", "ab" };
        System.out.println(countPrefixSuffixPairs(words));
    }
}

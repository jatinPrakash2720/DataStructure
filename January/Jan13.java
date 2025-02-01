public class Jan13 {
    class MinimumLength {
        public static int minimumLength(String s) {
            int length = 0;
            int[] countAplhabet = new int[26];
            for (char ch : s.toCharArray()) {
                countAplhabet[ch - 'a']++;
            }
            for (int freq : countAplhabet) {
                if (freq % 2 == 0) {
                    length += 2;
                } else {
                    length += 1;
                }
            }
            return length;
            // int sum = 0;
            // int[] countAplhabet = new int[26];
            // for (char ch : s.toCharArray()) {
            //     countAplhabet[ch - 'a']++;
            //     sum += 1;
            //     if (countAplhabet[ch - 'a'] ==3) {
            //         countAplhabet[ch - 'a']-=2;
            //         sum = sum - 2;
            //     }

            // }
            // return sum;
            // StringBuilder sNew = new StringBuilder(s);
        }
        
    }
    public static void main(String[] args) {
        
    }
}

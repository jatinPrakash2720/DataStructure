import java.util.*;


public class Jan12 {
    class FindRestaurant {
        public static int minSumIndex(String[] list1, String[] list2, Set<String> setList1) {
            // Set<String> setList1 = new HashSet<>(Arrays.asList(list1));
            // Set<String> setList2 = new HashSet<>(Arrays.asList(list2));
            // setList1.retainAll(setList2);
            int sum = Integer.MAX_VALUE;
            for (String str : setList1) {
               int a = Arrays.asList(list1).indexOf(str) + Arrays.asList(list2).indexOf(str);
               if (sum > a) {
                   sum = a;
               }

           }
           return sum;
            
        }

        public static String[] findRestaurant(String[] list1, String[] list2) {
            Set<String> setList1 = new HashSet<>(Arrays.asList(list1));
            Set<String> setList2 = new HashSet<>(Arrays.asList(list2));
            setList1.retainAll(setList2);
            int minSum = minSumIndex(list1, list2, setList1);
            List<String> output = new ArrayList<>();
            for (String str : setList1) {
                int a = Arrays.asList(list1).indexOf(str) + Arrays.asList(list2).indexOf(str);
                if (minSum == a) {
                    output.add(str);
                }

            }
            return output.toArray(new String[0]);
    }
    }
    class FindWords {
        public static boolean isCorrect(String str1, String str2) {
        for (char c : str1.toCharArray()) {
            //        asdfghjkl
            if (str2.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static String[] findWords(String[] words) {
        String[] givenArr = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
        int strNum = 0;
        List<String> output = new ArrayList<>();
        for (String str : words) {
            String str1 = str.toLowerCase();
            char ch = str1.charAt(0);
            // System.out.println(ch);
            if (givenArr[0].indexOf(ch) != -1) {
                // System.out.println("run1");
                strNum = 1;
            } else if (givenArr[1].indexOf(ch) != -1) {
                // System.out.println("run2");
                strNum = 2;
            } else if (givenArr[2].indexOf(ch) != -1) {
                // System.out.println("run3");
                strNum = 3;
            }
            if (isCorrect(str1, givenArr[strNum - 1])) {
                // System.out.println("runit");
                output.add(str);
            }
        }
        System.out.println(output);
        String[] outputArr = new String[output.size()];
        int i = 0;
        for (String str : output) {
            outputArr[i] = str;
            i++;
        }
        return outputArr;

    }
    }

    public static void printArray(String[] strArr) {
        System.out.print("( ");
        for (String str : strArr) {
            System.out.print(str + ",");
        }
        System.out.print(" )");
    }
    // public static boolean isValid(String s) {
    //     // s = "())()))"
    //     Stack<Character> stack = new Stack<>();
    //     for (char ch : s.toCharArray()) {
    //         if (ch == '(') {
    //             stack.push(')');
    //         } else if (stack.isEmpty() || stack.pop() == ch) {
    //             return false;
    //         }
    //     }
    //     return stack.isEmpty();

    // }
    // public static String builtValid(String s) {
    //     StringBuilder strOp = new StringBuilder();

    // }
    public static void main(String[] args) {
        String[] list1={"happy","sad","good"};
        String[] list2 = { "sad","happy","good" };

        // String[] words = { "Hello", "Alaska", "Dad", "Peace" };
        // findWords(words);

        FindRestaurant.findRestaurant(list1, list2);
    }
}

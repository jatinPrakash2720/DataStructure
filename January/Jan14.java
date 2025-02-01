public class Jan14 {
    class FndThePrefixCommonArray {
        public static int[] findThePrefixCommonArray(int[] A, int[] B) {
            int a = A.length;
            int b = B.length;
            int[] output = new int[a];
            int[] freqArr = new int[a];
            for (int i = 0; i < a && i < b; i++) {
                freqArr[A[i] - 1]++;
                freqArr[B[i] - 1]++;
                int sum = 0;
                for (int ele : freqArr) {
                    if (ele == 2) {
                        sum += 1;
                    }
                    // sum += 1;
                }
                output[i] = sum;
            }
            // printArray(output);
            return output;
            
        }
    }

    public static void printArray(int[] Arr) {
        for (int a : Arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        FndThePrefixCommonArray.findThePrefixCommonArray(A, B);
    }
}

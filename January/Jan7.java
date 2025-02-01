import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jan7 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];
        
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        // printArray(nums);
        int n = nums.length;
        for (int i = 0; i < n; i+=2) {
            if (i == n-1) {
                return nums[i];
            }
            //  { 4, 1, 2, 1, 2 }
            //  { 1, 1, 2, 2, 4 }
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    public int[] findArray(int[] pref) {
        for (int i = pref.length - 1; i > 0; i--) {
            pref[i] ^= pref[i - 1];
        }
        return pref;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;

        TreeNode t1 = new TreeNode(nums[mid]);
        t1.left = helper(nums, left, mid - 1);
        t1.right = helper(nums, mid + 1, right);
        inOrderTraversal(t1);
        return t1;
    }
    public static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;
        return helper(nums, 0, nums.length - 1);
    }
    public List<String> stringMatching(String[] words) {
        List<String> strOP=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].length() == words[j].length()) {
                    continue;
                }
                if (words[i].contains(words[j])) {
                    strOP.add(words[i]);
                    break;
                }
            }
        }
        return strOP;
    }

    public static int sumOfDivisors(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += getSumFactors(i);
            i++;
        }
        return sum;
    }

    public static int getSumFactors(int x) {
        int sumFactor = x;
        int i = 1;
        if (x == 1) {
            return 1;
        }
        while (i <= (x / 2)) {
            if (x % i == 0) {
                sumFactor += i;
            }
            i++;
        }
        return sumFactor;
    }

    public static boolean isArmstrong(int a) {
        int A = a;
        int b = 0;
        while (a != 0) {

            b = b + (int) Math.pow(a % 10, 3);
            a = a / 10;

        }
        return A == b;
    }

    public static int[] getHCFandLCM(int a, int b) {
        int A = a;
        int B = b;
        int[] ans = new int[2];
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        ans[0] = a;
        ans[1] = (A * B) / a;
        return ans;

    }

    public static void main(String[] args) {
        int[] a = { -10, -3, 0, 5, 9 };
        System.out.println(sortedArrayToBST(a));


    }
}
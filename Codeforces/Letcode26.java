package Codeforces;
// 26. Remove Duplicates from Sorted Array

public class Letcode26 {
    public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]!=nums[j]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i+1;
    }
}


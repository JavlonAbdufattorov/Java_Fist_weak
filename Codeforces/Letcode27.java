package Codeforces;

public class Letcode27 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        removeElement(nums, 3);
    }
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
                return 0;
        }
        int i = 0; 
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!= val) {

                nums[i] = nums[j];
                nums[j] = val;
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            System.out.println(nums[index]);
        }
        return i+1;
    }
    
}
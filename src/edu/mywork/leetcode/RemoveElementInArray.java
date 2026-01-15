package edu.mywork.leetcode;

public class RemoveElementInArray {
    static void main(String[] args) {
        int[]nums = {1,2,4};
        int val = 2;
        int k = removeElement(nums,val);
        System.out.print("\n"+k);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        for(int num: nums){
            System.out.println(num);
        }
        return k;
    }

}

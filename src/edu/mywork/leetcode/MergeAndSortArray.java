package edu.mywork.leetcode;

public class MergeAndSortArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] newarray = new int[m + n];

        for (int i = 0; i < m; i++) {
            newarray[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            newarray[m + i] = nums2[i];
        }

        for (int i = 0; i < m + n - 1; i++) {
            for (int j = 0; j < m + n - 1 - i; j++) {
                if (newarray[j] > newarray[j + 1]) {
                    int temp = newarray[j];
                    newarray[j] = newarray[j + 1];
                    newarray[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = newarray[i];
            System.out.print(nums1[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 0, 0};
        int[] nums2 = {4, 2};

        merge(nums1, 3, nums2, 2);
    }
}

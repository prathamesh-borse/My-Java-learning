package com.prathamesh.hackerrank;

public class PassingFunction {
    public static void main(String[] args) {
        int[] nums = {20, 30, 56, 78, 20};
        for (int j : nums) {
            System.out.println(j + " ");
        }
        change(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    static void change(int[] nums) {
        nums[4] = 99;
    }
}

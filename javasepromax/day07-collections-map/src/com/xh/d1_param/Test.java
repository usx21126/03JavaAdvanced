package com.xh.d1_param;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(2,3,4,5,6));
    }
    public static int sum(int...nums) {
        System.out.println(nums.getClass());
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        return 0;
    }
}

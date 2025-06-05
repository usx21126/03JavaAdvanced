package com.xh.d4_sf;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr, 79));

    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

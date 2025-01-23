package com.playground;
/*
* Provide a binary search algorithm with java code
* when argument is a sorted array, the easiest and efficient way to search the element in the array is BinarySearch
* because binary search logic is about dividing array in half in each step to find the value and since an array is already sorted
* BigO will come to O(log n) which is why this is the efficient way to search when its sorted
* */
public class BinarySearch {

    public static int search(int[] sortedArray, int target) {
        int left = 0; // start index
        int right = sortedArray.length - 1; // end index

        while (left <= right) {
            // find mid of array to split
            // may use (l + r) / 2 for simpler logic but might come to an overflow problem when the range of left and right is too large
            int mid = left + (right - left) / 2;

            if (sortedArray[mid] == target) {
                return mid; // found value
            } else if (sortedArray[mid] > target) {
                right = mid - 1; // search first half
            } else {
                left = mid + 1; // search second half
            }
        }

        return -1; // not found
    }
}

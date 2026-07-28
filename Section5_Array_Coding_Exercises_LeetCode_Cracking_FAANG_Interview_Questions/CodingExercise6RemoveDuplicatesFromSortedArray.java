/*
    Remove Duplicates from Sorted Array - LeetCode 26
    Given a sorted array nums, remove the duplicates in-place such that each element appears only once
    and returns the new length. Do not allocate extra space for another array;
    you must do this by modifying the input array in-place with O(1) extra memory.

    Example:

    Input: nums = [1, 1, 2]
    Output: 2
*/

public class CodingExercise6RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j=1; j<nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }
}

package main.java.day06_heaps_binary_search_intervals.walmart;

/**
 * LC 33 - Search in Rotated Sorted Array
 * Difficulty: Medium | Source: Walmart
 *
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown
 * pivot index k. Given the array nums after the possible rotation and an integer
 * target, return the index of target if it is in nums, or -1 if it is not.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1: nums = [4,5,6,7,0,1,2], target = 0 -> Output: 4
 * Example 2: nums = [4,5,6,7,0,1,2], target = 3 -> Output: -1
 * Example 3: nums = [1], target = 0 -> Output: -1
 *
 * Constraints:
 * - 1 <= nums.length <= 5000
 * - -10^4 <= nums[i] <= 10^4
 * - All values of nums are unique
 * - nums is an ascending array that is possibly rotated
 * - -10^4 <= target <= 10^4
 *
 * PATTERN: Modified Binary Search
 * HINT: Determine which half is sorted, then check if target lies in that sorted half.
 *       If yes, search that half; otherwise search the other half.
 *
 * TIME: O(log n) | SPACE: O(1)
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        //basic binary search
        int low = 0, high = nums.length-1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

//            if (target > nums[mid]) { Normal binary search
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
            if(nums[low] <= nums[mid]) { // first half is sorted
                if(target < nums[mid] && target >= nums[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] <= nums[high]) {
                if(target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}

package blind75.arrays;

import java.util.HashMap;

/**
 *  ContainsDuplicate:
 *  Checks if the given integer array contains any duplicate element.
 *  Returns true if any value appears at least twice, otherwise returns false.
 *
 *  Solution Idea (Using HashMap):
 *  - We store the numbers we have already seen in a HashMap.
 *  - While iterating over the array:
 *      - If the current number is already in the map → it has appeared before → duplicate exists → return true.
 *      - Otherwise, we put this number into the map and continue.
 *  - If the loop finishes with no duplicates found → return false.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> boolMap = new HashMap<>();
        int v = nums.length;

        for (int i = 0; i < v; i++) {
            int value = nums[i];

            if (boolMap.containsKey(value)) {
                return true;
            }

            boolMap.put(nums[i], i);
        }

        return false;
    }

    //test
    public static void main(String[] args) {
        ContainsDuplicate solver = new ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println("Test 1: " + solver.containsDuplicate(nums1)); // true
        System.out.println("Test 2: " + solver.containsDuplicate(nums2)); // false
        System.out.println("Test 3: " + solver.containsDuplicate(nums3)); // true
    }
}

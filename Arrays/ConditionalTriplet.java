package Arrays;

import java.util.Arrays;

public class ConditionalTriplet {
    public static void conditionalThreeSum(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate values for `i`
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    System.out.println("(" + nums[i] + ", " + nums[left] + ", " + nums[right] + ")");
                    left++;
                    right--;

                    // Skip duplicates for `left` and `right`
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++; // Increase the sum
                } else {
                    right--; // Decrease the sum
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        conditionalThreeSum(nums);
    }
}

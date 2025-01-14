package Arrays;

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int st = 0;
        int ed = nums.length - 1;

        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                st = mid + 1; // Target is in the right half
            } else {
                ed = mid - 1; // Target is in the left half
            }
        }

        return st;
    }

    public static void main(String[] str) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        searchInsert(nums, target);
    }
}

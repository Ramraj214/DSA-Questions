package Arrays;

public class InsertionSort {

    // time complexcity O(n^2)
    public static int[] insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 5, 4, 6 };
        insertionSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.err.println(nums[i]);
        }
    }
}

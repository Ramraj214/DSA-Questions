package Arrays;

public class CountSort {
    //time complexcity O(n + range)
    //it was applicable only for the positive numbers
    public static int[] countSort(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int[] frequency = new int[max+1];//include 0 also 
        for(int i=0;i<nums.length;i++){
            frequency[nums[i]]++;
        }

        int j=0;
        for(int i=0;i<frequency.length;i++){
            while (frequency[i]>0) {
                nums[j]=i;
                j++;
                frequency[i]--;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {2,3,1,5,4,6};
        countSort(nums);
        for(int i = 0;i<nums.length;i++){
            System.err.println(nums[i]);
        }
    }
}

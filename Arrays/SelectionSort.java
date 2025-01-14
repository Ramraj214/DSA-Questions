package Arrays;

public class SelectionSort {
    //time complexcity O(n^2)
    public static int[] selectionSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minPos]>nums[j]){
                    minPos = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minPos];
            nums[minPos] = temp; 
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {2,3,1,5,4,0};
        selectionSort(nums);
        for(int i = 0;i<nums.length;i++){
            System.err.println(nums[i]);
        }
    }
}

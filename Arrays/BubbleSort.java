package Arrays;

public class BubbleSort {

    //time complexcity O(n^2)
    public static int[] bubbleSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int swap = 0;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                return nums;
            }
        }
        return nums;
    }
    public static void main(String[]  args){
        int[] nums = {2,3,1,5,4,6};
        bubbleSort(nums);
        for(int i = 0;i<nums.length;i++){
            System.err.println(nums[i]);
        }
    }
}
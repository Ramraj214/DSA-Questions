package Arrays;

//VIMP
public class KadanesAlgo {
    
    public static int kadanes(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum>maxSum){
                maxSum = currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadanes(arr));
    }
}

//time complexcity = O(n)
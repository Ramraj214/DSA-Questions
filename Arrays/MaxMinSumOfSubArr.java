package Arrays;

public class MaxMinSumOfSubArr {
    public static int maxSumOfSubArr(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static int minSumOfSubArr(int[] arr){
        int minSum=Integer.MAX_VALUE;
        int currSum = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = 0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                if(minSum>currSum){
                    minSum = currSum;
                }
            }
        }
        return minSum;
    }

    public static void main(String[] args){
        int[] arr={1,-2,6,-1,3};
        maxSumOfSubArr(arr);
        minSumOfSubArr(arr);
    }
}

//time complexcity O(n^3)

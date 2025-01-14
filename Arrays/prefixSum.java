package Arrays;
//calculating max sum of the subarray using the prefix sum 
public class prefixSum {
    
    public static int maxSumOfSubArr(int[] arr){
        int[] prefix= new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            //calculate prefix sum
            prefix[i]=prefix[i-1]+arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currSum = (i == 0 ? prefix[j]: prefix[j]-prefix[i-1]);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] arr = {1,-2,6,-1,3};
        System.out.println(maxSumOfSubArr(arr));
    }
}

//time complexcity O(n^2)
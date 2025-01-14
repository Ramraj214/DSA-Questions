package Arrays;

public class PairsInArray {

    public static void pairsInArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ arr[i] +", "+ arr[j]+") ");
            }
            System.out.println();
        }
        int n = arr.length;
        System.out.println("total no of pairs = "+ (n*(n-1)/2));
    }
    
    public static void main(String[] args){
        int[] arr = {1,3,2,5,7};
        pairsInArray(arr);
    }
}

//time complexcity O(n^2)
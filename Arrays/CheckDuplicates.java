package Arrays;

public class CheckDuplicates {

    //time complexcity O(n^2)
    public static boolean checkDuplicates(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,1};
        System.out.println(checkDuplicates(arr));
    }
}

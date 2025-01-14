package Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr){
        int start = 0, end=arr.length-1;
        while (start<end) {
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

            start++;
            end--;
        }
    }
    
    public static void main(String[] args){
        int[] numbers = {6,4,10,6,2,3,7,4};
        reverseArray(numbers);
    }
}

//time comlexity = O(n/2) i.e O(n)
//space complexcity = O(1)
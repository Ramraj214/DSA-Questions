package Arrays;

public class LargestNumber {

    public static int getLargetNum(int[] arr){
        int largest = Integer.MIN_VALUE; //infinity
        for(int i=0;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int getSmallestNum(int[] arr){
        int smallest = Integer.MAX_VALUE; //infinity
        for(int i=0;i<arr.length;i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]){
        int[] numbers={2,5,3,8,10,3,0};
        System.out.println(getLargetNum(numbers));
    }
}

//time complexcity is proportional to the loop i.e O(n)
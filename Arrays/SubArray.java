package Arrays;

public class SubArray {
    public static void printSubArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        int n = arr.length;
        System.out.println("total sub arrays = " + (n*(n+1)/2));//formula
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        printSubArrays(arr);
    }
}

//time complexcity O(n^3)
package Arrays;

public class BinarySearch {
    //array must be in sorted order
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {//found
                return mid;
            }
            if (arr[mid] > key) {//left
                end = mid-1;
            }
            if (arr[mid] < key) {//right
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 2;
        System.out.println(binarySearch(numbers, key));
    }
}

//time complexcity is O(log n)
package Arrays;

public class BinarySearchonInvertedArr {

    public static int findPivot(int[] arr) {
        //find the pivot point
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                return mid;
            }
            if (arr[left] <= arr[mid] && arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int search(int[] arr,int left, int right , int target){
        while (left<=right) {
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    //time complexcity O(log n)
    public static int invertedSearch(int[] arr, int target){
        int pivot = findPivot(arr);

        if(arr[pivot] <= target && target <= arr[arr.length - 1]){
            return search(arr,pivot,arr.length-1,target);
        }else{
            return search(arr,0,pivot,target);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 1, 2, 3 };
        int target = 2;
        int pos = invertedSearch(arr, target);
        System.out.println(pos);
    }
}


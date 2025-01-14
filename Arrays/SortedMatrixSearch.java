package Arrays;

public class SortedMatrixSearch {
    //time complexcity O(n+m)
    public static boolean sortedMatrixSearch(int[][] matrix,int key){
        int row=0,col = matrix.length-1;
        while(row<matrix.length && col>0){
            if(matrix[row][col]==key){
                System.out.println("key is at"+"("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>key){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static void main(String[] args){
        int[][] matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int key = 10;
        sortedMatrixSearch(matrix, key);
    }
}

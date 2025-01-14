package Arrays;

//companies :- amzon,samsung,microsoft
//time complexcity : O(n)
public class DiagonalSum {
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j || i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }
        for(int i=0;i<n;i++){
            sum+=matrix[i][i];
            if(i != n-i-1){
                sum+=matrix[i][n-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3},
                { 5, 6, 7},
                { 9, 10, 11},
                // { 13, 14, 15, 16 } 
                };
        System.out.println(diagonalSum(matrix));
    }
}


public class darrays {

    public static int numberOfSeven(int arr[][]){
        int count = 0;
        for (int[] arr1 : arr) {
            for (int j = 0; j<arr[0].length; j++) {
                if (arr1[j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int SumOfSecRow(int nums[][]){
        int sum = 0;
        for(int i=0; i<nums[1].length; i++){
            sum += nums[1][i];
        }
        return sum;
    }

    public static void transposeMatrix(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int[][] transposed = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        for (int i=0; i<transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //!Print the number of 7's that are in the 2d array
        // int[][] arr = {{7,7,5}, {8,8,7}};
        // System.out.println(numberOfSeven(arr));

        //!Print out the sum of the numbers in the second row of the "nums" array
        // int nums[][] = {{1,4,9}, {11,4,3}, {2,2,3}};
        // System.out.println(SumOfSecRow(nums));
    
        //!Transpose of a matrix
        int[][] arr = {{1,2,3},{4,5,6}};
        transposeMatrix(arr);
    }
}

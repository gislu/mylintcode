public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
//     public boolean searchMatrix(int[][] matrix, int target) {
//         // write your code here
//         if (matrix == null || matrix.length == 0){
//             return false;
//         }
//         if (matrix[0] == null || matrix[0].length ==0){
//             return false;
//         }
//         int row = matrix.length;
//         int col = matrix[0].length;
//         int start = 0, end = row - 1;
//         while(start + 1 < end){
//             int mid = (start + end) / 2;
//             if (matrix[mid][0] == target){
//                 return true;
//             }else if(matrix[mid][0] < target){
//                 start = mid;
//             }else{
//                 end = mid;
//             }
//         }
        
//         if (matrix[end][0] <= target){
//             row = end;
//         }else if (matrix[start][0] <= target){
//             row = start;
//         }else{
//             return false;
//         }
        
//         start = 0;
//         end = col - 1;
//         while( start + 1 < end){
//             int mid = (start + end) /2;
//             if (matrix[row][mid] == target){
//                 return true;
//             }else if (matrix[row][mid] < target){
//                 start = mid;
//             }else { 
//                 end = mid;
//             }
//         }
        
//         if (matrix[row][start] == target || matrix[row][end] == target){
//             return true;
//         }
//         return false;
        
        
        
//     }
// }


public boolean searchMatrix(int[][] matrix, int target) {
        
        if (matrix == null || matrix.length == 0){
            return false;
        }
        if (matrix[0] == null || matrix[0].length ==0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
         
         int start = 0;
         int end = m * n - 1;
         
         while(start + 1 < end){
             int mid = start + (end - start) / 2;
             int row = mid / n;
             int col = mid % n;
             if (matrix[row][col] == target){
                 return true;
             }else if (matrix[row][col] > target) {
                 end = mid;
             }else {
                 start = mid;
             }
         }
         
         if (matrix[start / n][start % n] == target){
             return true;
         }
         if (matrix[end / n][end % n] == target){
             return true;
         }
         return false;
        
    }
}
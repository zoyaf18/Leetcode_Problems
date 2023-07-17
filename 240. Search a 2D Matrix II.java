class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;

        int col = matrix[0].length-1;
        int row = 0;

        while(col >= 0 && row <= matrix.length - 1){
            if (matrix[row][col] == target){
                return true;
            }
            else if (matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }        
        return false;
    }
}

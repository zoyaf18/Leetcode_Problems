class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m-1;

        int max_row = 0;
        int[] ans = new int[]{-1, -1};
        int mid = 0;

        while(low <= high){
            mid = low + (high - low)/2;
            
            for (int i = 0; i<n ; i++){
                if (mat[max_row][mid] < mat[i][mid]){
                    max_row = i;
                }
            }

            if ((mid == 0 || mat[max_row][mid] > mat[max_row][mid-1]) && (mid == m-1 || mat[max_row][mid] > mat[max_row][mid+1])){
                ans[0] = max_row;
                ans[1] = mid;
                return ans;
            } else if (mid > 0 && mat[max_row][mid] < mat[max_row][mid-1]){
                high = mid - 1;
            } else{
                low = mid +1;
            }
        }
        return ans;
    }
}

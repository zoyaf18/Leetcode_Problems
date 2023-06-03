class Solution {
    public boolean check(int[] nums) {
        int counter = 0;
        int n = nums.length;
        for (int i =1; i<n; i++){
            if (nums[i-1]>nums[i]){
                counter++;
            }
        }
        if(counter>1){
            return false;
        }
        if(nums[n-1]>nums[0] && counter !=0){
            return false;
        }
        return true;

        
    }
}

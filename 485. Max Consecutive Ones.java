class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int val = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                val++;
                max = Math.max(max, val);

            }
            else if (nums[i] == 0){
                val = 0;
            }
        }
        return max;
    }
}

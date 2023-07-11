class Solution {
    public int search(int[] nums, int target) {
        return BS(nums, target, 0, nums.length-1);        
    }
    
    public int BS(int nums[], int target, int start, int end){
        if(start > end) return -1;

        int mid = start + (end - start)/2;
        if (nums[mid] == target) return mid;

        if (nums[start] <= nums[mid]){
            if(target >= nums[start] && target <= nums[mid]){
                return BS(nums, target, start, mid-1);
            }    
            return BS(nums, target, mid+1, end);
        }
        else{
            if(target <= nums[end] && target >= nums[mid]){
                return BS(nums, target, mid+1, end);
            }    
            return BS(nums, target, start, mid-1);
        }

    }  
}

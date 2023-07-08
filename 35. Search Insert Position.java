class Solution {
    public int searchInsert(int[] nums, int target) {
        return BinarySearch(nums, 0, nums.length-1, target);
    }

    public int BinarySearch(int[] nums, int left, int right, int target){
        if (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (target < nums[mid]){
                return BinarySearch(nums, left, mid-1, target);
            }else {
                return BinarySearch(nums, mid+1, right, target);
            }
        } return left;
        
    }
}

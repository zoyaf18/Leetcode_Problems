class Solution {
    public boolean search(int[] nums, int target){
        int ans = BS(nums, target, 0, nums.length-1);
        if (ans != -1 && nums[ans] == target){
            return true;
        }else{
            return false;
        }
    }

    public int BS(int nums[], int target, int start, int end){
        if(start > end) return -1;

        int mid = start + (end - start)/2;
        if (nums[mid] == target) return mid;

        if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
            // Handle the case when nums[start] == nums[mid] == nums[end]
            // Iterate over duplicates
            while (start <= end && nums[start] == nums[mid]) {
                if (nums[start] == target) {
                    return start;
                }
                start++;
            }
            return BS(nums, target, start, end);
        }

        if (nums[start] <= nums[mid]) {
            if (target >= nums[start] && target <= nums[mid]) {
                return BS(nums, target, start, mid - 1);
            }
            if (target == nums[end]) {
                return end;
            }
            return BS(nums, target, mid + 1, end);
        } else {
            if (target >= nums[mid] && target <= nums[end]) {
                return BS(nums, target, mid + 1, end);
            }
            if (target == nums[start]) {
                return start;
            }
            return BS(nums, target, start, mid - 1);
        }

    }
}

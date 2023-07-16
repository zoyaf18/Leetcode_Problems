class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m == 0 && n == 0) {
            return 0;
        }

        if (m == 0) {
            return findMedian(nums2);
        } else if (n == 0) {
            return findMedian(nums1);
        }

        if (m > n){
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0;
        int high = m;
        int total = m+n;
        int pos = (total+1)/2;

        while (low <= high){
            int par1 = (low + high)/2;
            int par2 = pos - par1;

            int l1 = (par1 == 0)? Integer.MIN_VALUE : nums1[par1-1]; 
            int l2 = (par2 == 0) ? Integer.MIN_VALUE : nums2[par2 - 1];
            int r1 = (par1 == m)? Integer.MAX_VALUE : nums1[par1];
            int r2 = (par2 == n)? Integer.MAX_VALUE : nums2[par2];

            if(l1 <= r2 && l2 <= r1){
                if ((m+n)% 2 == 0){
                    return (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
                } else{
                    return Math.max(l1, l2);
                    
                }
            }
            else if (l1>r2){
                high = par1 - 1;
            }
            else low = par1+1;
            
        }
        throw new IllegalArgumentException("Arrays are not sorted.");       
    }

    public double findMedian(int[] nums) {
        int n = nums.length;
        int mid = n / 2;
        
        if (n % 2 == 0) {
            return (nums[mid - 1] + nums[mid]) / 2.0;
        } else {
            return nums[mid];
        }
    }
}

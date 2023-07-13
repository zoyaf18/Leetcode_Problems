class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = maxValue(nums);

        while(left < right){
            int mid = left + (right - left)/2;
            int sum = sumed(nums, mid);

            if (sum > threshold){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;

    }

    int maxValue(int[] nums){
        int max = Integer.MIN_VALUE;
        for (int i: nums){
            max = Math.max(i, max);
        }
        return max;
    }

    int sumed(int[] nums, int div){
        int sum = 0;
        for (int num: nums){
            sum += Math.ceil((double)num/div);
        }
        return sum;
    }
}

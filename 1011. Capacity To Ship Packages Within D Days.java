class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int w : weights){
            left = Math.max(w, left);
            right += w;
        }

        while(left < right){
            int mid = left + (right-left)/2;
            int day = 1;
            int weigh = 0;

            for (int w : weights){
                if (weigh + w > mid){
                    day++;
                    weigh = 0;
                }
                weigh += w;
            }
            if (day > days){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}

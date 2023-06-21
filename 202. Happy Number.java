class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do{
            slow = squared(slow);
            fast = squared(squared(fast));
        } while (slow != fast);
        if (slow == 1){
            return true;
        }
        
        return false;
    }

    public int squared(int n){
        int ans = 0;
        while(n>0){
            int rem = n % 10;
            ans += rem * rem;
            n = n/10;
        }
        return ans;
    }
}

class Solution {
    public boolean rotateString(String s, String goal) {
        if ( s == null || goal == null) return false;
        if (s.length() != goal.length()) return false;
        if (s.length() == 0) return true;

        String S = s+s;
        return (S.contains(goal));
    }
}

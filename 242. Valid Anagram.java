class Solution {
    public boolean isAnagram(String s, String t) {
        int[] checker = new int[26];
        for (int i = 0; i < s.length(); i++) checker[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++){
            checker[t.charAt(i) - 'a']--;
            if (checker[t.charAt(i) - 'a']< 0) return false;
        }
        for (int i : checker) if (i!=0) return false;
        return true;

    }
}

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder S= new StringBuilder();
        int open = 0;
        for (char c: s.toCharArray()) {
            if (c == '('){
                if (open > 0) S.append(c);
                open++;
            }else{
                if (open > 1) S.append(c);
                open--;
            }
        } 
        return S.toString();
    }
}

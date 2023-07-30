class Solution {
    public String reverseWords(String s) {
        Stack<String> a = new Stack<String>();
        for (String i : s.trim().split(" ")) {
            if ( !i.isEmpty()){
                a.push(i);
            }
        }

        StringBuilder b = new StringBuilder();
        while( !a.isEmpty()){
            b.append(a.pop());
            b.append(" ");
        }

        return b.toString().trim();

    }
}

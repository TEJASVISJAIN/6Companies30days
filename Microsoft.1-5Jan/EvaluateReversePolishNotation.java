// https://leetcode.com/problems/evaluate-reverse-polish-notation/
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int var1 = 0;
        int var2 = 0;
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                var1 = st.pop();
                var2 = st.pop();
                st.add(var1+var2);
            }
            else if(tokens[i].equals("-")){
                var1 = st.pop();
                var2 = st.pop();
                st.add(var2-var1);
            }
            else if(tokens[i].equals("*")){
                var1 = st.pop();
                var2 = st.pop();
                st.add(var2*var1);
            }
            else if(tokens[i].equals("/")){
               var1 = st.pop();
                var2 = st.pop();
                st.add(var2/var1);
            }
            else{
                st.add(Integer.parseInt(tokens[i]));
            }
        }
            return st.pop();
    }
}

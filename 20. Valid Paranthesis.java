class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if((n&1)==1) return false;
        Deque<Character> st=new ArrayDeque<>();
        int i=0;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                if(st.peek()=='(' && ch==')')
                    st.pop();
                else if(st.peek()=='{' && ch=='}')
                    st.pop();
                else if(st.peek()=='[' && ch==']')
                    st.pop();
                else return false;
            }
            i++;
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}

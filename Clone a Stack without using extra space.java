// Problem Link:-  https://practice.geeksforgeeks.org/problems/clone-a-stack-without-usinig-extra-space/0

class Solution {
    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        // to copy stack we need three stacks we already have 2 and 3rd comes from recursion
        helper(st,cloned,st.pop());
    }
    static void helper(Stack<Integer> st, Stack<Integer> clone, int cur){
        if(st.isEmpty()){
            clone.push(cur);
            return;
        }
        
        helper(st,clone,st.pop());
        clone.push(cur);
    }
}

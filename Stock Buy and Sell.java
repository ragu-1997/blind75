 // Find this question over GFG

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        // Since has not mentioned that how many times we can do transaction
        // that is buy and sell... so each time we see a profit we make transaction
        for(int i = 1; i < n; i++){
            
            if(A[i] > A[i-1]){
                ArrayList<Integer> temp = new ArrayList<>(2);
                temp.add(i-1);
                temp.add(i);
                ans.add(temp);
            }
        }
        
        return ans;
    }
}   

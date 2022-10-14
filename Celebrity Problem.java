// Problem Link :- https://practice.geeksforgeeks.org/problems/the-celebrity-problem/0

class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {
    	// code here 
    	Stack<Integer> st = new Stack<>();
    	for(int i=0; i<n; i++){
    	    st.push(i);
    	}
    	
    	while(st.size() > 1){
    	    int a = st.pop();
    	    int b = st.pop();
    	    
    	    if(arr[a][b] == 1 && arr[b][a] == 0){
    	        st.push(b);
    	    }
    	    else if(arr[a][b] == 0 && arr[b][a] == 1){
    	        st.push(a);
    	    }
    	}
    	if(st.size()==1){
    	    int k = st.peek();
    	    //check if everyone know him
    	    for(int i=0; i<n; i++){
    	        if(i!=k && arr[i][k] == 0){
    	            return -1;
    	        }
    	    }
    	    for(int i=0; i<n; i++){
    	        if(i!=k && arr[k][i] == 1){
    	            return -1;
    	        }
    	    }
    	    return k;
    	}
    	else
    	    return -1;
    }
}

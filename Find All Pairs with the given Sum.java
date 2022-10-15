// GFG Question

class Solution {
    public pair[] allPairs( long a[], long b[], long n, long m, long x) {
        
        ArrayList<pair> ans = new ArrayList<>();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i = 0; i < n; i++){
            
            long low = 0;
            long high = m-1;
            while(low <= high){
                int mid = (int)(low + high)/2;
                long temp = a[i] + b[mid];
                if(temp == x){
                    ans.add(new pair(a[i],b[mid]));
                    break;
                }
                if(temp < x ){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        
        pair[] sol = new pair[ans.size()];
        
        for(int i = 0; i < ans.size(); i++){
            sol[i] = ans.get(i);
        }
        
        return sol;
        
        
    }
}

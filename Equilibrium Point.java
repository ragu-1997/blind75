  public static int equilibriumPoint(long arr[], int n) {
        
        long sum = 0;
        long curSum = 0;
        
        for(long ele : arr){
            sum += ele;
        }
        
        int i = 0;
        
        for(; i < n; i++){
            
            sum -= arr[i];
            
            if(curSum == sum)
                break;
            
            curSum += arr[i];
        }
        
        if(i == n){
            return -1;
        }
        return i+1;
        
    }

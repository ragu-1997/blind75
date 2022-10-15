// GFG Question

class Solution
{
    int search(int a[], int low, int high, int target)
    {
        
        while(low<=high){
            int mid = low+(high - low)/2;
            
            if(a[mid]==target)
                return mid;
            
            if(a[low]<=a[mid]){                 
                 // Left-Side is sorted
                if(target>=a[low] && target<=a[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            
            else{   
                //Right side sorted
                if(target>=a[mid] && target <= a[high]){
                    low = mid+1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
        
    }
}

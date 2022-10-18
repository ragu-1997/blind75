//Question:
/**
 * 
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it can trap after raining.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array
 * [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section)
 * are being trapped.
 * Example 2:
 * 
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 */
public class RainWaterTraping {

}
// Solution:
/**
 * class Solution {
 * public int trap(int[] arr) {
 * int size=arr.length;
 * int maxHeight=0;
 * int ans=0;
 * int left[]=new int[size];
 * int right[]=new int[size];
 * left[0]=arr[0];
 * maxHeight=arr[0];
 * for(int i=1;i<size;i++){
 * if(arr[i]>maxHeight){
 * maxHeight=arr[i];
 * left[i]=maxHeight;
 * }
 * left[i]=maxHeight;
 * }
 * right[size-1]=arr[size-1];
 * for(int i=size-2;i>=0;i--){
 * right[i]=Math.max(right[i+1],arr[i]);
 * }
 * for(int i=0;i<size;i++){
 * ans+=Math.min(left[i],right[i])-arr[i];
 * 
 * }
 * return ans;
 * }
 * }
 */
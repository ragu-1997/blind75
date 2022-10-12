/**
 * Question:
 * 
 * Write an efficient algorithm that searches for a value target in an m x n
 * integer matrix matrix. This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the
 * previous row.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 * Example 2:
 * 
 * 
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 */

public class Search_in_a_2D_mat {

}

/**
 * Solution:
 * 
 * Approach 1 (My approach)(O(n))
 * class Solution {
 * public boolean searchMatrix(int[][] arr, int target) {
 * int col=arr[0].length-1;
 * int row=arr.length-1;
 * int temp=-1;
 * for(int i=0;i<=row;i++){
 * if(arr[i][0]<=target && arr[i][col]>=target){
 * temp=i;
 * break;
 * }
 * }
 * if(temp!=-1){
 * for(int j=0;j<=col;j++){
 * if(arr[temp][j]==target){
 * return true;
 * }
 * }}
 * return false;
 * }
 * }
 * 
 * Approach 2 (Striver Bhaiya)O(log(n*m))
 * 
 * if(arr.length==0)return false;
 * int n=matrix.length;
 * int m=matrix[0].length;
 * int lo=0;
 * int hi=(n*m)-1;
 * while(lo<=high){
 * int mid=(lo+(hi-lo)/2);
 * if(matrix[mid/m][mid%m]==target){
 * return true;
 * }
 * if(matrix[mid/m][mid%m]<target){
 * lo=mid+1;
 * }else{
 * hi=mid-1;
 * }
 * }
 * return false;
 * }
 */

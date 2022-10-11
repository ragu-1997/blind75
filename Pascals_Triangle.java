import java.util.*;

// Question : Pascals Triangle 
/* 
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

               1
            1     1
          1    2     1
        1    3    3     1
      1   4     6    4    1

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/

//Approach 1:

// public static List<List<Integer>> generate(int numRows) {
//   List<List<Integer>> parentAns = new ArrayList<>();
//   Collections.addAll(parentAns, new ArrayList<>() {{add(1);}});
//   int refI = 0;
//   for (int i = 1; i < numRows; i++) {
//       int left = 0;
//       int right = left + 1;
//       List<Integer> childAns = new ArrayList<>();
//       childAns.add(1);
//       while (right < parentAns.get(refI).size()) {
//           childAns.add(parentAns.get(refI).get(left) + parentAns.get(refI).get(right));
//           left++;
//           right++;
//       }
//       childAns.add(1);
//       parentAns.add(childAns);
//       refI++;
//   }
//   return parentAns;
// }

//Approach 2:

class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> row, pre = null;
    for (int i = 0; i < numRows; ++i) {
      row = new ArrayList<Integer>();
      for (int j = 0; j <= i; ++j) {
        if (j == 0 || j == i) {
          row.add(1);
        } else {
          row.add(pre.get(j - 1) + pre.get(j));
        }

      }
      pre = row;
      res.add(row);
    }
    return res;
  }
}

public class Pascals_Triangle {
  public static void main(String[] args) {

    Solution s = new Solution();
    List<List<Integer>> ans = new ArrayList<>();
    ans = s.generate(4);
    System.out.println(ans.get(0));

  }

}

// Arraylist Solution

/*
 * public static ArrayList<ArrayList<Long>> printPascal(int n) {
 * // Write your code here.
 * ArrayList<ArrayList<Long>> triangle = new ArrayList<>();
 * for(int i=0;i<n;i++){
 * ArrayList<Long> thisRow = new ArrayList<>();
 * for(int j=0;j<i+1;j++){
 * if(j==0 || j==i)
 * thisRow.add(1L);
 * else
 * thisRow.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
 * }
 * triangle.add(thisRow);
 * }
 * return triangle;
 * }
 */

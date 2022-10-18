/**
 * Question:
 * 
 * Given an integer x, return true if x is palindrome integer.
 * 
 * An integer is a palindrome when it reads the same backward as forward.
 * 
 * For example, 121 is a palindrome while 123 is not.
 * 
 * 
 * Example 1:
 * 
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * 
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * 
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class pelindromeNumber {
}
// Solution
/**
 * class Solution {
 * public boolean isPalindrome(int x) {
 * // If x is a negative number it is not a palindrome
 * // If x % 10 = 0, in order for it to be a palindrome the first digit should
 * also be 0
 * if (x < 0 || (x != 0 && x % 10 == 0))
 * return false;
 * int res = 0;
 * while (x > res) {
 * res = res * 10 + x % 10;
 * x = x / 10;
 * }
 * // If x is equal to reversed number then it is a palindrome
 * // If x has odd number of digits, dicard the middle digit before comparing
 * with x
 * // Example, if x = 23132, at the end of for loop x = 23 and reversedNum = 231
 * // So, reversedNum/10 = 23, which is equal to x
 * return (x == res || x == res / 10);
 * }
 * }
 * 
 */
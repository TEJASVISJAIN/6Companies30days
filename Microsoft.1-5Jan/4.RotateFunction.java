//https://leetcode.com/problems/rotate-function/description/
class Solution {
    public int maxRotateFunction (int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0, func = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            func += i * nums[i];
        }
        int dp [] = new int [nums.length];
        int n = nums.length;
        dp[0] = func;
        max = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i-1] + sum - n* nums[n - i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
//Problem: https://leetcode.com/problems/jump-game
//Solution using greedy approach

class Solution {
    public boolean canJump(int[] nums) {
        int x = 0;
        int len = nums.length;
      
        for(int i = 0; i<len ; i++){
           if(i > x) 
             return false;
           x = Math.max(x, nums[i]+i);
        }
      
     return true;       
    }
}

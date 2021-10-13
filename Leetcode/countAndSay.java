//Problem: https://leetcode.com/problems/count-and-say

class Solution {
  
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
      
        String p = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
      
        while(i < p.length()) {
            char c = p.charAt(i++);
            int count = 1;
          
            while(i < p.length() && p.charAt(i) == c) {
                i++;
                count++;
            }
          
            sb.append(count);
            sb.append(c);
        }
      
        return sb.toString();
    }
}

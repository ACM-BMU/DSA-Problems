//Leetcode climbing stairs  ques no -70
//You are climbing a staircase. It takes n steps to reach the top.

//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
class Solution {
public:
    int climbStairs(int n) {
        
        if(n<=0) return 0;
        
        if(n==0 || n==1)return 1;
        
        if(n==2) return 2;
        
        int a=1,b=1,c;
        for (int i=0;i<n-1;i++)
        {
            c=a+b;
            a=b;
            b=c;
            
        }
        return c;
    }
};

// fibonacci series

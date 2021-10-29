//136. Single Number

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int i,result=0;
        for(i=0;i<nums.size();i++)
        {
            result ^= nums[i];
        }
        return result;
    }
};
#58. Length of Last Word

class Solution {
public:
    int lengthOfLastWord(string s) {
        int p,count=0;
        p=s.length();
        while(p>0)
        {
            if(s[--p] !=' '){
                count++;
                   }
            else if(count>0)  
                return count;
        }
        return count;
    }
};
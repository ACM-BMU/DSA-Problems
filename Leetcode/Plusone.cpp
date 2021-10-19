//leetcode plus one - ques no 66


class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
       //  cout<<digits.size();
        vector<int> result;
        int size= digits.size(),num=0,n=0;
        int i= size-1, carry=0;
//         int n= digits.size()-1,carry=1,sum;
        
//         for(int i=n;i>=0;i--)
//         {
//         sum=digits[i]+carry;
//         result.push_back(sum%10);
//         carry=sum/10;
//     }
            
        while(i>=0)
        {
            if (digits[i] != 9)
            {
                if(i== size-1)
                    {
                        result.push_back(digits[i]+1);
                    }

                else
                    {
                       if(carry==1)
                           {
                               result.push_back(digits[i]+1);
                               carry =0;
                           }

                        else 
                            {
                                result.push_back(digits[i]);
                            }

                    } 
            }
            
            else 
            {
                if(i== size-1)
                    {
                        result.push_back(0);
                        carry=1;
                    }
                
                else 
                    {
                        if(carry==1)
                           {
                               result.push_back(0);
                               carry =1;
                           }

                        else 
                            {
                                result.push_back(digits[i]);
                                carry=0;
                            }

                    }
            }
            
           
            i--;
        }
    
         if(carry ==1)
            {
                result.push_back(1);
            }
        
        reverse(result.begin(),result.end());
        return result;
        
        
    }
};

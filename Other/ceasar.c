#include <cs50.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h> 

int key (int a);

int main (int argc, string argv[])
{  
   int j= atoi(argv[1]);    
   int k=key(j);
   string word=get_string("enter word:");
   for (int i=0, n=strlen(word); i<n; i++)
   {
      if((word[i]+k)<90 && isupper(word[i]))
      {
          printf("%c", word[i]+k);
      }
      else if((word[i]+k)>90 && isupper(word[i]))
      {
          printf("%c", word[i]+k-26);
      }
       else if((word[i]+k)>122 && islower(word[i]))
      {
          printf("%c", word[i]+k-26);
      }
      if((word[i]+k)<122 && islower(word[i]))
      {
          printf("%c", word[i]+k);
      }
   }
}

int key (int a)
{
    if(a<0 || a>26)
    {
        do
        {
            printf("enter valid key \n");
            return 0
        }
        while(a<0 ||a>26);
    }
       return a;
}

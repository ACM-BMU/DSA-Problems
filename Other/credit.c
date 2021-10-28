#include <stdio.h>
#include <cs50.h>
#include <math.h>


int main (void)
{
                                                                             //taking credit card no input from user
    int long n;
    do
    {
      n=get_long("enter card no:");
    }
    while (n<999999999999 || n>9999999999999999);
    printf ("credit card no: %li\n", n);
                                                                     //counting and displaying the no of digits in the no
    int y=0;
    for (long int x=n; x>0; x=x/10)
    {
       y++;
    }
    printf("no of digits in credit card no:%i\n", y);
                                                                             //taking sum of alternate digits
    long int m=n/10;
    long int b;
    int s=0;
    for(int a=y; a>0; a--) 
    {
       b=(m%10)*2;
       s=s+(b/10);
       s=s+(b%10);
       m=m/100;
    }
                                                                              //taking alternate no from the start
    int d=0;
    long int z=n;
    for(int c=y; c>0; c--)                                                                          
    {
      d=d+(z%10);
      z=z/100;
    }
    int e=d+s;
                                                                               //printing if the card is legit or not
    if((e%10)==0)
    {
      printf("the card is legit!!\n");
    }
    else
    {
      printf("the card is not legit!!\n");
    }
                                                                                      //printing type of card
    long int f=n;
    long int h= pow(10, y-1);
    long int g=f/h;
    if (g==3)
    {
      printf("the card is American Expess\n");
    }
    else if (g==5)
    {
      printf("the card is Mastercard\n");
    }
    else if (g==4)
    {
      printf ("the card is Visa\n");
    }
   
}


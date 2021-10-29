import java.util.Scanner;
class Comp
{
static int onescomp(int n)
{
int noofbits = (int)(Math.floor(Math.log(n) /Math.log(2))) + 1;
return ((1 << noofbits) - 1) ^ n;
}
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the integer:");
int n = sc.nextInt();
System.out.print("Binary equivalent of entered integer is " +onescomp(n));
}
}

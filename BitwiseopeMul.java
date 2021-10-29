import java.util.Scanner;  
class Mul 
{
public static void main(String args[]) 
{
int N;
System.out.print("Enter any even integer: ");  
Scanner sc = new Scanner(System.in); 
N = sc.nextInt();
N = N << 1;
System.out.println("Result is  " +N);
}
}

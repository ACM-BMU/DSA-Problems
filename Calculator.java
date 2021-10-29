class Calculator
{
float num1,num2;
public void add(float num1,float num2)
{
this.num1=num1;
this.num2=num2;
System.out.println(+num1+"+"+num2+"="+(num1+num2));
}
public void sub(float num1,float num2)
{
this.num1=num1;
this.num2=num2;
System.out.println(+num1+"-"+num2+"="+(num1-num2));
}
public void mul(float num1,float num2)
{
this.num1=num1;
this.num2=num2;
System.out.println(+num1+"*"+num2+"="+(num1*num2));
}
public void div(float num1,float num2)
{
this.num1=num1;
this.num2=num2;
System.out.println(+num1+"/"+num2+"="+(num1/num2));
}
public void mod(float num1,float num2)
{
this.num1=num1;
this.num2=num2;
System.out.println(+num1+"%"+num2+"="+(num1%num2));
}
}
class Calc extends Calculator
{
public static void main(String[] args)
{
Calculator ob =new Calculator();
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers: ");
float first = sc.nextFloat();
float second = sc.nextFloat();
System.out.println("Select your choice \n  1)Addition\n2)Subtraction\n3)Multiplication\n4)Division\n5)Modulo");
int choice = sc.nextInt();
switch(choice)
{
case 1:
ob.add(first,second);
break;
case 2:
ob.sub(first,second);
break;
case 3:
ob.mul(first,second);
break;
case 4:
ob.div(first,second);
break;
case 5:
ob.mod(first,second);
break;
default:
System.out.printf("Error! operator is not correct");
}
}
}

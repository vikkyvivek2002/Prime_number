import java.util.Scanner;
class Prime_number
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter a number");
int n = s.nextInt();
int flag = 1;
if(n==0||n==1)
System.out.println(n + " is not a prime number");
else
{
for(int i=2; i<n/2; i++)
{
if(n%i == 0)
{
System.out.println(n + " is not a prime number");
flag=0;
 break;
}
}
if (flag == 1)
System.out.println(n +" is a prime number");
}
}
}
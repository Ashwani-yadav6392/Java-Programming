import java.util.Scanner;
class Q3 {
public static void main(String args []) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any number");
int n=sc.nextInt();
int sum=getSum(n);
System.out.println("Sum is:"+n+"natural Numbers is " + sum);
}
public static int getSum(int n) {
if(n>1)
return n+getSum(n-1);
else
return n;
}
}

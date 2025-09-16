import java.util.Scanner;
class Factorial{
public static void main(String args []) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
int fact=getFactorial(n);
System.out.println(n +"!= "+ fact);
}

public static int getFactorial(int n){
if(n>1)
return n*getFactorial(n-1);
return n;
}
}
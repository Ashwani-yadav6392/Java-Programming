
import java.util.Scanner;
class Fibonacci{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		
                 int fib=getfib(n);
                 
		System.out.println(n+"Fibonacci is : "+fib);
	}
	public static int getfib(int n){

        if(n==0 || n==1)
     return n;
    return getfib(n-1)+getfib(n-2);

	}
}
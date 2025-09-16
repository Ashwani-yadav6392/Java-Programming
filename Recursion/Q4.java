//1^2+2^2+3^2+4^2+5^2+......upto 100
import java.util.Scanner;
class Q4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		int sum=getSum(n);
		System.out.println("Sum of Squares of "+n+" natural Numbers is: "+sum);
	}
	public static int getSum(int n){
		if(n>1)
			return n*n+getSum(n-1);
		else
			return n*n;
	}
}
//4*3+3*2+2*1
import java.util.Scanner;
class Q5Sum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		int sum=getSum(n);
		System.out.println("Sum of series upto "+n+" is: "+sum);
	}
	public static int getSum(int n){
		if(n>1)
			return n*(n-1)+getSum(n-1);
		else
			return n*(n-1);
	}
}
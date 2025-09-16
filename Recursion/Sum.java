
import java.util.Scanner;
class Sum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();

                 
		System.out.println("Sum of number is : "+add(a,b));
	}
	public static int add(int a, int b){

        return a+b;

	}
}
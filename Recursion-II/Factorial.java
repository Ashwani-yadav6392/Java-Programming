import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
                int fact=getFact(n);
                System.out.println(n+"fact is "+fact); 
	}
	public static int getFact(int n){

                    if(n>1)
                         return n*getFact(n-1);
                            return n;




		}
}
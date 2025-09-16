import java.util.Scanner;
class Sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		int sum=getSum(n);
                 System.out.println(n+"Total sum is " + sum);

       
	}
	public static int getSum(int n){
		if(n>1){
		  return n+getSum(n-1);
                 }else{
                         return n;
                    
		}
	}
}
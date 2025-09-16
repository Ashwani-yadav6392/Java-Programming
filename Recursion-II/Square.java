import java.util.Scanner;
class Square
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		int s=getSquare(n);	
                System.out.println(n+"Squares is "+s);
}
	public static int getSquare(int n){
		if(n>1)
return n*n*n;
return n;
						


            
	}
}
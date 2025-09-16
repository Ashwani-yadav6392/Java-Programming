import java.util.Scanner;
class Cube
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
                int cube=getCube(n);
                System.out.println(n+"Cube is "+cube); 
	}
	public static int getCube(int n){

                    if(n>1)
                         return n*n*n;
                            return n;




		}
}
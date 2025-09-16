import java.util.Scanner;
class Table
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		printTable(n, 1);
	}
	public static void printTable(int n, int i){
		if(i<=10){
			System.out.println(n+"*"+i+"= "+n*i);
			printTable(n, i+1);
		}
	}
}
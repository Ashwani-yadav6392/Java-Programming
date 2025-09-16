import java.util.Scanner;
class Triangle {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of Rows");
int n=sc.nextInt();
PrintPattern(n);
}
public static void PrintPattern(int n){
int star=n,space=0;
for(int i=1;i<=n;i++){
    for(int j=1;j<=space;j++)
				System.out.print("  ");
		for(int j=1;j<=star;j++)
				System.out.print("* ");
	star--;	space++;
   System.out.println();
}
}
}


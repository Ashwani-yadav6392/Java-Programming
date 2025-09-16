import java.util.Scanner;
class Triangle {
public static void main (String args []) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any number");
int n=sc.nextInt();
PrintPattern(n);
}

public static void PrintPattern(int n){
int star=n;
for(int i=1;i<=n;i++){
for(int j=1;j<=star;j++)
System.out.print("* ");
star--;
System.out.print(" ");
System.out.println();
}
}
}


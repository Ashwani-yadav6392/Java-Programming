import java.util.Scanner;
class Q1 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any numebr");
int n=sc.nextInt();
PrintPattern(n);

}

public static void PrintPattern(int n ) {

int star=n;
for(int i=1;i<=n;i++){
for(int j=1;j<=star;j++)
    System.out.print(i%2 +" ");
System.out.println();
}
}
}

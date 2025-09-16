/* 
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
*/


import java.util.Scanner;
class Q1 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any numebr");
int n=sc.nextInt();
PrintPattern(n);

}

public static void PrintPattern(int n ) {


for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++)
    System.out.print(i +" ");
System.out.println();
}
}
}

/*


*
* *
* * *
* * * *
* * *
* *
*




*/


import java.util.Scanner;
class Pyramid2{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any number");
int n=sc.nextInt();
 PrintPattern(n);
}

public static void PrintPattern(int n){
int star = 1, mid=n/2+1;
for(int i=1;i<=n;i++){
for(int j=1;j<=star;j++)
System.out.print("* ");
if(i<mid)
star++;
else
star--;
System.out.println();
}
}
}
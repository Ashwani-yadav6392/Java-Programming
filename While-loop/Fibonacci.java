import java.util.*;
class Fibonacci{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();


printFib(n);
}

public static void printFib(int n){

Scanner sc=new Scanner(System.in);
System.out.println("Enter Number 0");
 int  n0=sc.nextInt();

System.out.println("Enter Number 1");
 int  n1=sc.nextInt();

System.out.println("Enter Number 2");
  int  n2=sc.nextInt();

int count = 0;
System.out.print(n0+" "+n1+" "+n2+" ");

int i = 1;
while(i<=n-2){
int n3 = n1+n2;
System.out.print(n3+" ");
count++;
n1 = n2;
n2 = n3;
i++;
}
System.out.println("\nTotal Such number of "+count);
}

}

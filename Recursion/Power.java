import java.util.Scanner;
class Power{
public static void main(String args []) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int power=getPower(n);
System.out.println(n+"Power of "+power);
}
public static int getPower(int n){
if(n>1)
return n*n;
else
    return n;
}
}

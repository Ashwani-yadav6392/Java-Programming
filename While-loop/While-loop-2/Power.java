import java.util.Scanner;
class Power{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a  Number");
int a=sc.nextInt();
System.out.println("Enter b  Number");
int b=sc.nextInt();
int pow=getPower(a,b);
System.out.println(a+" Power "+ b +" is = "+ pow);
}
public static int getPower(int a, int b){
int power = 1;
int i=1;
while(i<=b){
 power=power*a;
i++;
}
return power;
}
}
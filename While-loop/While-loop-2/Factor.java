import java.util.Scanner;
class Factor{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any   Number");
int n=sc.nextInt();
int result=getFactor(n);
System.out.println("Sum of Factors ("+ n + ")is: "+ result);
}
public static int getFactor(int n){
int sum = 0;
int i=1;
while(i<n){
if(n%i==0){
sum=sum+i;
}
i++;
}
return sum;
}
}
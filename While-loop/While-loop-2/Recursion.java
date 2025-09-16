import java.util.Scanner;
class Recursion {
static int count=0;
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number");
int n=sc.nextInt();
 int digit=getCount(n);
System.out.println(n+ " count is = " + digit);
}

public static int getCount(int n){
if(n==0 || n==1)
return 1;
return count+1+getCount(n/10);
}
}
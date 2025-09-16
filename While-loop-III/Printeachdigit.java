import java.util.*;
class Printeachdigit {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
while(n>0){
int rem=n%10;
if(rem>=5)
System.out.println(rem);
n=n/10;
}
}
}


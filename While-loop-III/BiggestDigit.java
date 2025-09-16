import java.util.*;
class BiggestDigit {
public static void main(String args []) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any Number");
int n=sc.nextInt();
int big=n%10;
while(n>0){
int rem = n%10;
if(rem>big)
big=rem;
n=n/10;
}
System.out.println(big);
}
}
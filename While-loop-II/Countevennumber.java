class Countevennumber{
public static void main(String args []){
int n=154624;
int count = 0;
int i=1;
while(i<=n){
int rem=n%10;
if(rem%2==0){
 
 count++;
}
n=n/10;
}
System.out.println("Total Number is " + count);
}
}
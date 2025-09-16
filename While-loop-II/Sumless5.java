class Sumless5 {
public static void main(String args []){
int n =42765;
int sum =0;
while(n>0){
int rem=n%10;
if(rem<=5)
  sum=sum+rem;

 n=n/10;
}
System.out.println(sum);
}
}


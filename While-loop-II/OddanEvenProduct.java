class OddanEvenProduct{
public static void main(String args[]){
int n=9635;
while(n>0){
int rem=n%10;
if(rem%2==0){
 System.out.println("Number is even Product");
}
else if(rem%2==1){
 System.out.println("Number is Odd Product");

}
n=n/10;
}
}
}

  
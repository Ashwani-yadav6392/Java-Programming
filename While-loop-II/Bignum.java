class Bignum {
public static void main(String args[]){

int n = 43705;
int big = n%10;
while(n>0){
int rem=n%10;
if(rem>big)
big=rem;

n=n/10;
}
System.out.println(big);
}
}
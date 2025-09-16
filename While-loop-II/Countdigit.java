class Countdigit{
public static void main(String args[]){
int n=437059;
int count=0;
while(n>0){

int rem=n%10;
count++;
System.out.println(count);
n=n/10;
}
System.out.println("Total Number is "+count);

}
}
   





import java.util.*;
class evenDigit {

public static int eachevendigit( int n){
     while(n>0) {
    int rem = n%10;
    if(rem%n==0)

    System.out.println(rem);


      n=n/10;
  }
 return n;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();


   eachevendigit(n);


    }
}




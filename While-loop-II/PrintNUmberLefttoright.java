import java.util.*;
class PrintNUmberLefttoright {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number");
int n=sc.nextInt();
printFromLeft(n);


}


public static void printFromLeft(int n){
int count = getCount(n);
while(count>0){
int digit =(n/getPower(10,count-1))%10;
System.out.println(digit);
count--;
}
}
public static int getCount(int n){
int count = 0;
while(n>0){
count++;
n=n/10;
}
return count;
}

public static int getPower(int a,int b){
int pow=1;
int i =1;
while(i<=b){
pow=pow*a;
i++;
}
return pow;
}

}




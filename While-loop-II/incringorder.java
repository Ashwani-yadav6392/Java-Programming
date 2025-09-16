import java.util.*;
class incringorder {

public static boolean isIncring(int n){
int next = n%10;
n=n/10;
while(n>0)
{
int prev = n%10;
if(prev >next)
return false;
next = prev;
n=n/10;
}
return true;
}

public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
System.out.println(isIncring(n));               
         

}
}





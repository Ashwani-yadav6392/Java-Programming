import java.util.Scanner;
class Program3 {
public static void main(String args[]) {
Scanner sc=new  Scanner(System.in);
System.out.println("Enter any no of Rows") ;
int n=sc.nextInt();
PrintPattern(n);
}

public static void PrintPattern(int n){ 
int star=1, space=n/2; int mid=n/2+1;
for(int i=1;1<=n;i++) {
   int num=n;
for(int j=1;j<=space;j++)
System.out.print("  ");
for(int j=1;j<=star;j++) {
System.out.print("%-3d",num);
}
if(i<mid){
star+=2;
 space--;
}else{
star-=2; space++;
}
num--;
System.out.println();
}
}
}



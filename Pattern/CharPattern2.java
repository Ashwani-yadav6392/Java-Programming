
/*
A A A A A
  B B B B
    C C C
      D D
        E
*/
import java.util.Scanner;
class CharPattern2 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
PatternPrint(n);
}

/*
public static void PatternPrint(int n) {
int star=n,space=0,x=65;
for(int i=1;i<=n;i++){
for(int j=1;j<=space;j++)
System.out.print("  ");
for(int j=1;j<=star;j++){
System.out.print((char)(x)+" ");
}
star--; space++; x++;
System.out.println();
}
}
}*/

public static void PatternPrint(int n)
{
int star=1,num=1;
for(int i =1;i<=n;i++){
for(int j=1;j<=star;j++)
System.out.print(num-- +"\t");
num=num+2*i+1;
star++;
System.out.println();
}
}
}
/*

A B C D E
  F G H I
    J K L
      M N
        O
*/



import java.util.Scanner;
class CharPattern{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number of char");
int n=sc.nextInt();
CharPattern(n);
}

public static void CharPattern(int n){
int star=1,space=n-1, x=65;
for(int i=1;i<=n;i++){
for(int j=1;j<=star;j++)
System.out.print((char) (x) +" ");
x++;

 
for(int j=1;j<=space;j++)
System.out.print("  ");
star++;  space --;
System.out.println();
}
}
}


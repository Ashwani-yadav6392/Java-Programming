import java.util.Scanner;
class Arro {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter any no of Rows");
int n=sc.nextInt();
PrintPattren(n);
}

public static void PrintPattren(int n) {
int star = 1,space=n/2,mid= n/2+1;
for(int i =1;i<=n;i++){
for(int j=1;j<=space;j++)
System.out.print("  ");
for(int j=1;j<=star;j++)
System.out.print("*   ");
if(i<mid){
star++; space--;
}else{
star--; space++;
}

System.out.println();
}
}
}
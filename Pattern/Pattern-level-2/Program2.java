import java.util.Scanner;
class Program2 {
public static void main(String args[]) {
Scanner sc=new  Scanner(System.in);
System.out.println("Enter any no of Rows") ;
int n=sc.nextInt();
PrintPattern(n);
}

public static void PrintPattern(int n) {
 int x = 65; 
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(x) + " ");
             x++;
            }
            System.out.println();
        }
    }
}
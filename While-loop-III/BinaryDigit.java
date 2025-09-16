import java.util.Scanner;
public class BinaryDigit {
public static int getBinaryDigit(int n) {
  int count = 0;
  while (n > 0) {
    count++;
    n /= 2;
   }
   return count;
 }

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
System.out.print("Enter a number: ");
  int n = sc.nextInt();      
  int Count = getBinaryDigit(n);
        
System.out.println("Number of binary digits: " + Count);
        
        
    }
}

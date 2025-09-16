import java.util.*;
class Factors2{
public static void main(String args[]){

 Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factors of " + n + " (excluding " + n + "):");

        int i = 1;  
        while (i <= n / 2) {   
            if (n % i == 0) {
                System.out.print(i + "\t");
            }
            i++;
        }
    }
}


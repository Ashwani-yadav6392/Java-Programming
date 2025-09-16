/*

* * * * * * * * *
* *     *     * *
*   *   *   *   *
*     * * *     *
* * * * * * * * *
*     * * *     *
*   *   *   *   *
* *     *     * *
* * * * * * * * *

*/


import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
int mid=n/2+1;
    
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) {
            if(i==1||i==n||j==1||i==j||j==n||i+j==n+1||i==mid||j==mid ||j==n)
              System.out.print("* ");
              else
                
                   System.out.print("  ");
                  
                }  
                              
            
            System.out.println();
        }
    }
}

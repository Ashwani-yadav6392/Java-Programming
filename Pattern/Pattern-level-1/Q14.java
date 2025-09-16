/*

7
7
6 6
5 5 5
4 4 4 4
3 3 3 3 3
2 2 2 2 2 2
1 1 1 1 1 1 1

*/


import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
       int star=1,space=n-1;
      for(int i=0;i<n;i++){
         for(int j=1;j<=star;j++)     
                   System.out.print( n-i  +" "  );

           for(int j =1;j<=space;j++)
                  System.out.print("  ");

              star++; space--;
                              
            
            System.out.println();
        }
    }
}

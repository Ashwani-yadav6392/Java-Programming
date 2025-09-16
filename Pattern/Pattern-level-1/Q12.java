/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7


*/


import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
       int star=1,space=n-1;
      for(int i=1;i<=n;i++){
         for(int j=1;j<=star;j++)     
                   System.out.print( j +" ");

           for(int j =1;j<=space;j++)
                  System.out.print("  ");

              star++; space--;
                              
            
            System.out.println();
        }
    }
}

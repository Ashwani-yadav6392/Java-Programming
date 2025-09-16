/*

1
0 0
1 1 1
0 0 0 0
1 1 1 1 1
0 0 0 0 0 0
1 1 1 1 1 1 1


*/


import java.util.Scanner;

class Q11 {
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
                   System.out.print(i%2 +" ");
           for(int j =1;j<=space;j++)
                  System.out.print("  ");

              star++; space--;
                              
            
            System.out.println();
        }
    }
}

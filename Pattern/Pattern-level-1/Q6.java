


import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
       if(n%2==0){
            System.out.println("Pattern is Not Possible for Even Rows...");
               return;
}

      int mid=n/2+1;

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) {
            if(i==mid||j==mid)
              System.out.print("* ");
              else
                
                   System.out.print("  ");
                  
                }  
                              
            
            System.out.println();
        }
    }
}

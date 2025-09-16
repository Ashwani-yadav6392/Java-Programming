
/*

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

*/

import java.util.Scanner;
class Q3 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any numebr");
int n=sc.nextInt();
PrintPattern(n);

}

public static void PrintPattern(int n ) {

for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++)
    System.out.print(j +" ");
    
  
System.out.println();
}
}
}

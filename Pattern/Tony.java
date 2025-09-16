import java.util.Scanner;
class Tony{
public static void main(String args[]) {
Scanner sc=new  Scanner(System.in);
System.out.println("Enter any no of Rows") ;
int n=sc.nextInt();
PrintPattern(n);
}

public static void PrintPattern(int n){
int star=1,space=n-1;
  for(int i=1;i<=n;i++){
   for(int j=1;j<=space;j++)    
        System.out.print("  ");
            

       for(int j =1;j<=star;j++)
         if(i%2==0){
         
          System.out.print( (j+1)%2+" ");
}
else{
System.out.print(j%2+" ");
}

       star++; space--;
System.out.println();
}
}
}
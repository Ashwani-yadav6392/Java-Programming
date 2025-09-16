import java.util.Scanner;
class Program {
 public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of");
    int size=sc.nextInt();
    int [] arr=new int[size];
   for(int i=0;i<arr.length;i++){
   System.out.print("Enter the Element "+(i+1)+" : ");
    arr[i]=sc.nextInt();
     }
    System.out.println("\nArray Elements are... ");
for(int i=0;i<arr.length;i++)
if(i%2==0)
  System.out.print(arr[i]+" ");
  }
}
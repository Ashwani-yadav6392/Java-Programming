import java.util.Scanner;
class Program2 {
 public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of");
    int size=sc.nextInt();
    int[] arr=new int[size];
   for(int i=0;i<arr.length;i++){
   System.out.println("Enter the Element "+ (i+1) + " : " );
arr[i]=sc.nextInt();
}
System.out.println("\nArray Element are..");
int count=0;
for(int i=0;i<arr.length;i++){
if(arr[i]%2==0){
count++;
}
}
System.out.println(count);
}
}


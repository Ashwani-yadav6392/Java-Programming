class Reverse {
public static void main(String args[]) {
int[] arr={10,20,30,40,50,60,70};

System.out.print("Original array :");
for(int s:arr){
System.out.print(" "+s);
}
System.out.println();
reverse(arr);
System.out.print("Reverse array  :");
for(int n:arr) {
System.out.print(" "+n);
}
}
public static void reverse(int[] arr) {
int start = 0; int end = arr.length-1;
while(start<end) {
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++; end--;
}
}
}
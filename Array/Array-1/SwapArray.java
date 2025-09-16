class SwapArray {
public static void main(String args []) {
int[] arr = {10,20,30,40,50,60,70};
System.out.print("Original array");
for(int s:arr){
System.out.print(" "+s);
}
SwapElement(arr,1,5);
System.out.print("Swapped array");
for(int x :arr){
System.out.print(" "+x);
}
}

public static void SwapElement(int[] arr,int i,int j) {
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;

System.out.println();
}
}

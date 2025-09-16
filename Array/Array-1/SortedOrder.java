class SortedOrder {
public static void main(String args[]){
int[] arr = {2,7,7,8,9};

if(isSorted(arr)){
System.out.println("Array is Sorted ");
}
else{
System.out.println("Array is Not Sorted ");
}
}

public static boolean isSorted(int[] arr){
for(int i=0;i<arr.length - 1;i++){
if(arr[i]>arr[i+1]) {
return false;
}
}
return true;
}
}
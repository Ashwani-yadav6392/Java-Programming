class Increasing {
public static void main(String args[]){

int[] arr = {2,3,7,8,9 };
if(isIncreasing(arr)){
System.out.println("Array is Increasing");
}else{
System.out.println("Array is not Increasing");
}
}


public static boolean isIncreasing(int[] arr){
  for(int i = 0; i<arr.length - 1; i++) {
    if(arr[i] >= arr[i+1]) {
   return false;
}
}
return true;
}
}
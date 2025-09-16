class MoveZeroes {
public static void main(String args[]) {
int[] arr = {7,0,2,6,0,4};
moveZeroes(arr);

System.out.print("Array after moving zeroes: ");
for(int x : arr) {
  System.out.print(x + " ");
}
}

public static void moveZeroes(int[] arr) {
 int index = 0;
for(int i = 0; i<arr.length;i++) {
 if(arr[i] != 0){
   arr[index] = arr[i];
    index++;
}
}

while(index < arr.length) {
  arr[index] = 0;
  index++;
}
}
}

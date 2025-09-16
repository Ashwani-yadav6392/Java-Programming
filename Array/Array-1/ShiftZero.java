class ShiftZero {
public static void main(String args[]){
int[] arr = {0,1,1,0,0,1,0,0};
shiftZeros(arr);
for(int x:arr){
System.out.print(x+ " ");
}

}

public static void shiftZeros(int[] arr){
int zero = 0; 
for(int x:arr){
if(x==0)
zero++;
}


for(int i=0; i<arr.length; i++){
if(i<zero)
arr[i] = 0;
else
arr[i] = 1;
}
}
}
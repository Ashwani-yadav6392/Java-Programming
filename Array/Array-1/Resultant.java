class Resultant {
public static void main(String args[]) {
int[] arr = {2,5,4,3,6};
getrequirement(arr);
}

public static void getrequirement(int[] arr) {
int sum =0;
for(int s : arr){
sum=sum+s;
}
for(int i=0;i<arr.length;i++){
arr[i] = sum - arr[i];
}

for(int x:arr){
System.out.println(x);
}
}
}
class Remove {
public static void main(String args[]) {
int[] arr = {10,20,30,40,50,60,70};
int k = 3;
for(int x: arr){
System.out.print(x+" ");
}

System.out.println();
for(int s:arr){
System.out.print(s+" ");
}
}

public static int[] remove(int[] arr,int k) {
int[] b = new int[arr.length - 1];
for(int i = 0;i<b.length;i++){
if(i<k)
b[i] = arr[i];
else
b[i] = arr[i+1];
}
return b ;
}
}


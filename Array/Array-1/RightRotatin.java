class RightRotatin {
public static void main(String args []) {
int[] a = {1,2,3,4,5,6,7};
int k = 2;

getRotation(a,k);
for(int x:a){
System.out.print(x+" ");
}
}

public static void getRotation(int[] a,int k){
k=k%a.length;
if(k==0)
 return;
reverse(a,0,a.length-1);
reverse(a,0,k-1);
reverse(a,k,a.length-1);
}

public static void reverse(int[] a,int start, int end) {
while(start<end){
int temp = a[start];
a[start] = a[end];
a[end] = temp;

start++; end--;
}
}
}
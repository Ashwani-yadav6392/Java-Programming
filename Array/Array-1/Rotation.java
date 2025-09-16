class Rotation {
public static void main(String args[]) {
int[] a = {10,20,30,40,50,60,70};
rightRotation(a);
for(int x:a){
System.out.print(x+" ");
}
}


public static void rightRotation(int[] a) {
int temp = a[a.length -1];
for(int i = a.length-2;i>=0;i--){
a[i+1] = a[i];
}
a[0] = temp;
}
}
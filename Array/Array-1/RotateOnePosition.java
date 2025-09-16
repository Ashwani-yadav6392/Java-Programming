class RotateOnePosition {
public static void main(String args[]){
int[] a = {10,20,30,40,50,60,70};

System.out.println("Original array:");
for(int x:a){
System.out.print(x +" ");
}
getRotate(a);

System.out.println("\nRotated array : ");
for(int x: a){
System.out.print(x+ " ");
}
}


public static void getRotate(int[] a) {
int first = a[0]; 
for(int i = 0;i<a.length - 1;i++){
a[i] = a[i + 1];
}
a[a.length - 1] = first;
}
}



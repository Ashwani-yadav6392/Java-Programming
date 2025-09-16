class Swap {
public static void main(String args []) {
int[] a={10,20,30,40,50};

swap(a,1,3);

for(int n:a) {
System.out.println(n + " ");
}
}
public static void swap(int[] a, int i,int j) {
int temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}


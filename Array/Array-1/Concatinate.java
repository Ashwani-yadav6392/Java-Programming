class Concatinate {
public static void main(String args[]) {
int[] arr= {1,2,1};
int[] result = getConcate(arr);
for(int x:result){
System.out.println(x+" ");
}
}

public static int[] getConcate(int[] arr) {
int res[] = new int[2*arr.length];
for(int i=0; i<arr.length;i++) {
res[i] = arr[i];
res[arr.length +i] = arr[i];
}
return res;
}
}



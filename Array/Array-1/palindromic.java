class palindromic {
public static void main(String args[]) {
int[] arr = {10,20,30,40,30,20,10};
boolean result = ispalindromic(arr);
System.out.println(result);
}

public static boolean ispalindromic(int[] arr) {
int start = 0; int end=arr.length - 1;
while(start<end) {
if(arr[start]!=arr[end])
return false;
start++; end--;
}
return true;
}
}
 
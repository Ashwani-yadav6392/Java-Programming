class MissingElement {
public static void main(String args[]){
int n = 7;
int[] arr = {7,4,3,0,5,1,6};
int missing =findMissing(arr,n);
System.out.println("Missing Element " + missing);
}

public static int findMissing(int[] arr,int n) {
 int sum = n*(n+1)/2;
int actualsum = 0;
for(int x: arr) {
actualsum += x;
}

return sum - actualsum;
}
}
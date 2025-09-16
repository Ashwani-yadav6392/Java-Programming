class BiggestNum {
public static void main(String args []) {
int[] a = {60,23,44,33,50};
getBigNum(a);

}
public static void getBigNum(int[] a) {
int biggestNum = a[0];
for(int p:a){
if(p>biggestNum)
biggestNum = p;
}
System.out.println(biggestNum);
}
}
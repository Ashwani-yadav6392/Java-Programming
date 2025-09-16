class Q2 {
public static void main(String args []) {

test(1);
}
public static void test(int n) {
if(n<=10){
test(n+1);
System.out.println(n);

}
}
}
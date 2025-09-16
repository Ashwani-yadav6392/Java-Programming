class Withoutvar{

public static void main(String [] args){

int a=10;
int b=20;
int c=30;

a = a+b+c;
a = a-c;
b = a-b;
c = c-b;

System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
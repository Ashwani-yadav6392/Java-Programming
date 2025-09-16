class PrintSizestring {
public static void main(String args []) {
String[] str={"Tony","Hulk","Thor","fgh"};
evenString(str);
}

public static void evenString(String[] str) {
int count = 0;
for(String s:str) {
if(s.length()%2==0){
System.out.println(s);
count++;
}
}
System.out.println("Total such String are : "+ count);
}
}
class LargeString {
public static void main(String args[]) {
String[] str = {"Tony","A","B","Abc"};

largeString(str);
}

public static void largeString(String[] str){
String biggestStr = str[0];
for(String s:str){
if(s.length()>biggestStr.length()) {
biggestStr = s;
}
}
System.out.println("The Largest String is : "+ biggestStr);
}
}

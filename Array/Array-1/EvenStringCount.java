class EvenStringCount {
public static void main(String args[]) {
String[] str = {"Tony","Thor","Hulk","Ashwani"};
getCount(str);
}

public static int getCount(String[] str) {
int count = 0;
for(String s:str){
if(s.length()%2==0){
System.out.println(s);
count++;
}
}
 return count;
}
}

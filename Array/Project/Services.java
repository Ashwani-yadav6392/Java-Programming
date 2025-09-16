class Services{
public static void PrintAllEmployee(Empolyee[] e) {
for(Empolyee  x : e){
System.out.println(x.getDetails());

  }

}

public static void getCountAge(Empolyee[] e) {
int count=0;
for(Empolyee x: e){
   if(x.age<30) {
System.out.println(x.getDetails());
count++;
}
}
System.out.println("Total Such Empolyee are : "+count);
}


public static void getHightSalandLeast(Empolyee [] e) {
Empolyee biggest=e[0];
Empolyee smallest=e[0];

for(Empolyee x :e){
 if(x.salary>biggest.salary)
    biggest=x;
if(x.salary<smallest.salary)
    smallest=x;
}
System.out.println("Highest Salary Employ is:"+biggest.getDetails());
System.out.println("Smallest Salary Employ is:"+smallest.getDetails());
}
}



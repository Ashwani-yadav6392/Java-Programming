class Empolyee {
String name;
int id,age;
double salary;

Empolyee(String name,int id,int age,double salary){
      this.name=name;
      this.id=id;
      this.age=age;
      this.salary=salary;
}
public String getDetails() {
return "Name : "+ name +"\tId : " + id + "\tAge : "+age +"\tSalary : "+ salary;
}
}


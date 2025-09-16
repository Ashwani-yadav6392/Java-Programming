class EmpolyeeDriver {
public static void main(String args []) {
Empolyee e1=new Empolyee("Tony",1,22,250000);
Empolyee e2=new Empolyee("Thor",3,30,2500.5);
Empolyee e3=new Empolyee("Stack",4, 35,15000);
Empolyee e4=new Empolyee("Bruc",6,40,10000);
Empolyee e5=new Empolyee("Spider",8,25,30000);
Empolyee e6=new Empolyee("Looki",10,23,20000);
Empolyee e7=new Empolyee("Hulk",2,24,25000);
Empolyee e8=new Empolyee("Jack",5,35,5000);
Empolyee e9=new Empolyee("War",9,29,18000);
Empolyee e10=new Empolyee("Mack",7,27,16442);

Empolyee[] empolyee ={e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};

Services.PrintAllEmployee(empolyee);


System.out.println("===================Age<30 years========================");

Services.getCountAge(empolyee);

System.out.println("===================Highest And least Salary========================");

Services.getHightSalandLeast(empolyee);


}
}
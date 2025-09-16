class Program5{
public static void main(String []args){

int count = 0;
int i = 1;
int n = 28;
while(i<=n/2){
if(n%i==0)
//System.out.print(i+" ");
count ++;
i++;
}
System.out.println("Total factor is :"+count);
}
}
class SumMulti{
public static void main(String args []){
int count = 0;
int i = 1;
int sum = 0;
int power =2;
while(i<=100){
sum+=i*power*(i+1);
count++;

i++;
System.out.println("The sum of the seriesis "+sum);

}
System.out.println("Total Sum is  "+count);
}
}


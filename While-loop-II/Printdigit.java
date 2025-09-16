class Printdigit {
public static void main(String args []){
int n =43705;
int lastdigit = 0;
int i = 1;
while(i<n){
if(n%i==1)
i++;
}
System.out.println(lastdigit);
}
}


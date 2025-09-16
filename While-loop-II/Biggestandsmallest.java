class Biggestandsmallest{
public static void main(String args[]){

int n=42375;
int big,small;
int i=0;
while(i<=n){
i++;
int rem =n%10;
if(rem>big)
big=rem;
else if(rem<small)
small=rem;


n=n/10;

}
System.out.println(big+""+small);
}
}


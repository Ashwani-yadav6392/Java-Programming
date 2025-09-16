class BigAndSmall {
public static void main(String args []) {
int[] arr ={12,45,12,36,22,7,46};
PrintBigandSmall(arr);

}

public static void PrintBigandSmall(int [] arr) {
int biggest = arr[0];
int smallest = arr[0];

for(int p:arr){
if(p>biggest)
smallest = p;
}
System.out.println(biggest);
System.out.println(smallest);
}
}

                                                                                        
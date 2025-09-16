import java.util.*;
class evendigits {
public static void main (String args [] ){
int n=43705;
     while(n>0) {
    int rem = n%10;
    if(rem%n==0)

    System.out.println(rem);


      n=n/10;
  }

}
}



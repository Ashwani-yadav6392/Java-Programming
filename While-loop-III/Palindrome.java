import java.util.Scanner;
class Palindrome {
public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any number");
int n=sc.nextInt();
if(isPalindrome(n))
  System.out.println(n+" is palindrome number");
else
  System.out.println(n+" is not a palindrome number");
}

public static boolean isPalindrome(int n){
 String s=n+"";
 int start = 0,end=s.length() -1;
 while(start<end){
  if(s.charAt(start)!=s.charAt(end))
    return false;
    start ++;
    end --;
  }
return true;
 }
}


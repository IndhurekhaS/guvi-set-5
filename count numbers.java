import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       int count=0;
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           count++;
       }
       System.out.println(count);
       
       
    }
}

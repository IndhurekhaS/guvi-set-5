import java.util.*;
public class add{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String s1=sc.next();
       int l1=s.length();
       int l2=s1.length();
       if(l1>l2)
       {
           System.out.println(s);
       }
       else{
       System.out.println(s1);
       }
      
    }
}

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int b=0;
       int a[]=new int [n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
          b=b+a[i];
       }
       int c=b/n;
       System.out.println(c);
      
    }
}

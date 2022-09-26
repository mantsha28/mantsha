import java.util.*;

 // Compiler version JDK 11.0.2

 public class recursion 
 {
   public static void printfib(int a, int b, int n)
   {
     if(n==0||n==1)
     {
       return; 
     }
     int c = a+b;
     System.out.println(c);
     printfib(b, c, n-1);
   }
   public static void main(String args[])
   { 
     int a=0, b=1, n=10;
    System.out.println(a);
    System.out.println(b);
    printfib(a,b,n-1);
   }
 }

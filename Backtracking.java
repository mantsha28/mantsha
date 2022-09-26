import java.util.*;

 // Compiler version JDK 11.0.2

 class backtracking 
 {
   public static void prinpermutation (String Str, String perm,int idx)
   {
   if(Str.length()==0)
   {
     System.out.println(perm);
     return ;
   }
   for(int i=0; i<Str.length(); i++)
   {
     char currchar = Str.charAt(i);
     String newstr = Str.substring(0,i)+Str.substring(i+1);
     prinpermutation(newstr,perm+currchar,idx+1);
   }
   }
   public static void main(String args[])
   { 
    String Str="ABC";
    prinpermutation(Str,"",0);
   }
 }

import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class EX10{
     public static void main(String aa[]){
      int a;
    // String dd=" ";
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      String b=String.valueOf(a);
     // System.out.println(b);
      char c[]=b.toCharArray();
      HashMap<Integer,Character>p=new HashMap<Integer, Character>();
      char v='A';
      int count=0;
      for(int i=1;i<26;i++){
          p.put(i, v);
          v++;
      }
      for(int i=0;i<c.length;i++){
          int c1=Character.getNumericValue(c[i]);
         // System.out.println(c1);
         if(p.containsKey(c1)){
          char t=  p.get(c1);
          System.out.println(t);
          //dd=dd+t;
         // System.out.println(dd);
          count++;
          }
      }
      System.out.println(count);
     

    }
}

import java.util.*;


  public class Armstrong{  
    public static void main(String[] args)  {  
      int c=0,a,temp;  
      Scanner s=new Scanner(System.in);
      
      int n=s.nextInt();  
      temp=n;  
      while(n>0)  
      {  
        a=n%10;  
        n=n/10;  
        c=c+(a*a*a);  
      }  
      if(temp==c)  
      System.out.println("armstrong number");   
      else  
      System.out.println("Not armstrong number");   
    }  
  }  

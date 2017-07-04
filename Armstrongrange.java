import java.io.*;
import java.util.*;
 public class Armstrong

{
  
  public static void main(String[] args) 
  
  {
     Scanner s=new Scanner(System.in);
    int n, count = 0, a, b, c, sum = 0;
    System.out.println("Enter the number 1:");      
    int y=s.nextInt();
    System.out.println("Enter the number 2:");      
    int z=s.nextInt();
    for(int i = y; i <= z; i++)
    {
      n = i;
       while(n > 0)
      {
         b = n % 10;
        sum = sum + (b * b * b);
        n = n / 10;
        }
      if(sum == i)
      {
        System.out.print(i+" ");
        }
      sum = 0;
      }
    }
  }

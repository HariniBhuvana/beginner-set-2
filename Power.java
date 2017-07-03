import java.io.*;
import java.util.*;
public class Power
{
  public static void main (String args[])
  {
    Scanner s=new Scanner(System.in);
    int power=1;
    int a=s.nextInt();
    int b=s.nextInt();
    if(a==0)
    {
      System.out.println("0");
    }
    else if(b==0)
    {
      System.out.println("1");
    }
    for(int i=0;i<b;i++)
    {
      if(a>0 && b>0)
      {
        power=power*a;
      }
    }
    System.out.println("Power: "+power);
  }
}

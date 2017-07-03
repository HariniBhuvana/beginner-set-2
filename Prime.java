import java.io.*;
import java.util.*;
public class PrimeNumbers {
  
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int  count=0;
    int num=s.nextInt();
    String a;
    for (int i = 1; i <= num; i++) {
      count = 0;
      for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          count++;
          break;
        }
      }
    }
    
    if (count == 0) {
      System.out.println("Prime number");
    }
    
    
    
  }
}

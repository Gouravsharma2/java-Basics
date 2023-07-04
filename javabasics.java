import java.util.*;
public class javabasics{
  public static int multiply () {
    Scanner Sc = new Scanner (System.in);
    System.out.print("A = ");
    int a = Sc.nextInt();
    System.out.print("B = ");
    int b = Sc.nextInt();
    int c = (a * b);
    System.out.print("PRODUCT OF A AND B = ");
    System.out.println(c);
    return a;
  }
  public static void main (String args[]) {
   // Scanner Sc = new Scanner (System.in);
    //System.out.print("A = ");
    //int a = Sc.nextInt();
    //System.out.print("B = ");
    //int b = Sc.nextInt();
    //int c = (a * b);
    //System.out.print("PRODUCT OF A AND B = ");
    //System.out.println(c);
    multiply ();
  }
}
import java.util.*;
public class javabasics {

  public static void main(String args[]) {
    Scanner SC = new Scanner (System.in);
    System.out.print("cost of pouch =  ");
    int a = SC.nextInt();
    System.out.print("cost of pen =  ");
    int b = SC.nextInt();
     System.out.print("cost of pencil =  ");
     int c = SC.nextInt();
     System.out.print("cost of eraser =  ");
    int d = SC.nextInt();
    System.out.print("GST = ");
    int TOTAL = (a+b+c+d );
    System.out.println(TOTAL*0.18f);
   
    System.out.print("total cost including GST = ");
     System.out.print(TOTAL*0.18f + TOTAL);

  }
}
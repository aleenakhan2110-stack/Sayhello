import java.util.Scanner;
public class ageindays {
   public  static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int years=N/365;
       int remainingdays=N%365;

       int months=remainingdays;

       int days=remainingdays%30;
       System.out.println(years+"years");
       System.out.println(months+"months");
       System.out.println(days+"days");



    }
}

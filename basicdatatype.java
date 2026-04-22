import java.util.Scanner;
public class basicdatatype {
   public  static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       long l=sc.nextLong();
       char ch=sc.next().charAt(0);
       float f=sc.nextFloat();
       double d=sc.nextDouble();

       sc.close();
       System.out.println(n);
       System.out.println(l);
       System.out.println(ch);
       System.out.println(f);
       System.out.println("%.1f%n",d);



    }
}

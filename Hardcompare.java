import java.util.Scanner;
public class Hardcompare {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         double A=sc.nextDouble();
         double B=sc.nextDouble();
         double C=sc.nextDouble();
         double D=sc.nextDouble();

         if(B*Math.log(A)>C*Math.log(D)){
             System.out.println("Yes");
         }
         else{
             System.out.println("NO");
         }




    }
}

import java.util.Scanner;
public class thelast2digit {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int A=sc.nextInt();
         int B=sc.nextInt();
         int C=sc.nextInt();
         int D=sc.nextInt();
         int result=0;
         int finalresult=0;
         result=A*B*C*D;
         finalresult=result%100;
         System.out.println(finalresult);



    }
}

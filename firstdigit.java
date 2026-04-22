import java.util.Scanner;
public class firstdigit {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int reversed=0;
         while(n!=0){
             int digit=n%10;//get the last digit
             reversed=reversed*10+digit;
             n/=10; //to remove the last digit from the input so that we can perform rest operation on the new one

         }
         int m=reversed%10;
         if(m%2==0){
             System.out.println("even");
         }
         else{
             System.out.println("odd");
         }

    }
}

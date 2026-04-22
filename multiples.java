

import java.util.Scanner;
public class multiples {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int A = sc.nextInt();
         int B = sc.nextInt();
         if (A % B == 0) {
             System.out.println("Multiples"); }
         else if(B%A==0){
             System.out.println("Multiples");
         }
         else{
             System.out.println("No Multiples");
         }



     }}

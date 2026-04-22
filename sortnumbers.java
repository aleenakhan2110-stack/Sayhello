import java.util.Scanner;
public class sortnumbers {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int A = sc.nextInt();
         int B = sc.nextInt();
         int C = sc.nextInt();

         int min,mid=0, max;
         if (A <= B && A <= C) {
             min = A;
             if (B <= C) {
                 min = B;
                 max = C;
             } else {
                 mid = C;
                 max = B;
             }
         }  else if(B<=A&&B<=C){
             min=B;
             if(A<=C){
                 min=A;
                 max=C;
             }
             else {
                 mid=C;
                 max=A;
             }}
         else {
             min = C;
         if (A<=B) {
             min = A;
             max = B;
         } else {
             mid = B;
             max = C;
         }


     }
         System.out.println(min);
         System.out.println(mid);
         System.out.println(max);

         System.out.println();

         System.out.println(A);
         System.out.println(B);
         System.out.println(C);

}}

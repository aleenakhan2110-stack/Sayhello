import java.util.Scanner;
public class maxandmin {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C =sc.nextInt();
    int maxval=Math.max(A,Math.max(B, C));
    int minval=Math.min(A,Math.min(B,C));
         System.out.println(minval+""+maxval);


}}

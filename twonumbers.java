import java.util.Scanner;
public class twonumbers {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    long A=sc.nextLong();
    long B=sc.nextLong();
    double result=(double) A/B;
    long floorResult=(long) Math.floor(result);
    long ceilResult=(long) Math.ceil(result);
    long roundResult=(long) Math.round(result);


        System.out.println("floor"+A+"/"+B+"="+floorResult);
        System.out.println("ceil"+A+"/"+B+"="+ceilResult);
        System.out.println("round"+A+"/"+B+"="+roundResult);

}}

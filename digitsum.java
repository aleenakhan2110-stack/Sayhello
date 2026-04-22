import java.util.Scanner;
public class digitsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int N=sc.nextInt();
        int M =sc.nextInt();
        int C=N%10;
        int D =M%10;
        int sum=C+D;
        System.out.println(sum);

    }
}

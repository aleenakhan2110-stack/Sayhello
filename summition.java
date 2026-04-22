import java.util.Scanner;
public class summition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers");
        int N=sc.nextInt();
        int sum=N*(N+1)/2;
        System.out.println(sum);

    }

}

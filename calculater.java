import java.util.Scanner;
public class calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        char ch;
        if(ch =='+'){
            System.out.println(A+B);

        }
        else if(ch=='-'){
            System.out.println(A-B);

        }
        else if(ch=='*'){
            System.out.println(A*B);
        }
        else if(ch=='/'){
            System.out.println(A/B);
        }

    }
}

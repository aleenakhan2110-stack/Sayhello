import java.util.Scanner;
public class lowertoupper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char X=sc.next().charAt(0);
        char result;
        if(Character.isUpperCase(X)){
            result=Character.toLowerCase(X);

        }
        else  {
            result=Character.toUpperCase(X);
        }
        System.out.println(result);


    }
}

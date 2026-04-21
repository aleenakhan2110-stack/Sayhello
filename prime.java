import java.util.Scanner;
public class prime {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         if(sc.hasNextLong()){
             long x=sc.nextLong();
             if(isPrime(x)){
                 System.out.println("Yes");

             }
             else{
                 System.out.println("No");
             }
         }
}
public static boolean isPrime(long n){
         if(n<2) return false;
         for(long i=2;i*i<=n;i++){
             if(n%i==0){
                 return false;
             }
         }
           return true;  

}


}

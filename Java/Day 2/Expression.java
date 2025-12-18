import java.util.InputMismatchException;
import java.util.Scanner;
public class Expression{
   public static void main( String [] args){
        Scanner scan  = new Scanner(System.in);
        try{
            System.out.println("Enter the first number: ");
            int a = scan.nextInt();
            System.out.println("Enter the second number: ");
            int b = scan.nextInt();
            int ans = a/b;
            System.out.println(a + "/"+ b + " = "+ans);
        }catch( ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.print(e.getMessage());
        }finally{
            System.out.println("\n"+"End");
            scan.close();
        }
   }
}
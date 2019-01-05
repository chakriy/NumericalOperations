package loveProgramming;
import java.util.Scanner;
public class NumericalOperationsTest
{
    public static void main(String[] args)
    {
        numericalOperations n1 = new numericalOperations();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First integer: ");
        int a = input.nextInt();
        System.out.println("Enter Second integer: ");
        int b = input.nextInt();
        System.out.println("Sum is "+n1.getsum(a,b));
        System.out.println("Difference is "+n1.getdifference(a,b));
        System.out.println("Product is "+n1.getProduct(a,b));
        System.out.println("Quotient is "+n1.getQuotient(a,b));
        System.out.println("Mod is "+n1.getMod(a,b));
System.out.println("This is Internal Input");
        numericalOperations n2 = new numericalOperations();
      n2.getFirstNumber(125);n2.getSecondNumber(24);System.out.println("Sum is "+n2.sum());
      System.out.println("Difference is "+n2.difference());
      System.out.println("Product is "+n2.product());
      System.out.println("Quotient is "+n2.quotient());
      System.out.println("Mod is "+n2.mod());

    }
}



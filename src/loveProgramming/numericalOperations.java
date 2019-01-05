package loveProgramming;
public class numericalOperations
{
   private int FirstNumber;
   private int SecondNumber;

    public void getFirstNumber(int FirstNumber)
    {
        this.FirstNumber = FirstNumber;
    }
    public void getSecondNumber(int SecondNumber)
    {
        this.SecondNumber = SecondNumber;
    }
    public int getsum(int a, int b)
    {
        // System.out.println(a+b);
        return a + b;
    }
    public int getdifference(int a, int b)
    {
        return a - b;
    }
    public int getProduct(int a, int b)
    {
        return a * b;
    }
    public int getQuotient(int a, int b)
    {
        return a / b;
    }
    public int getMod(int a,int b)
    {
        return a % b;
    }
    public int sum()
    {
    return FirstNumber + SecondNumber;
    }
    public int difference()
    {
        return FirstNumber - SecondNumber;
    }
    public int product()
    {
        return FirstNumber * SecondNumber;
    }
    public int quotient()
    {
        return FirstNumber / SecondNumber;
    }
    public int mod()
    {
        return FirstNumber % SecondNumber;
    }
}

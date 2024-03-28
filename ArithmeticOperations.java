public class ArithmeticOperations {
    public int add(int num1, int num2)
    {
        return num1+num2;
    }
    public int subract(int num1, int num2)
    {
        return num1-num2;
    }
    public float mulitiply(float num1, float num2)
    {
        return num1*num2;
    }
    public int division(int num1, int num2)
    {
        return num1/num2;
    }
    public static void main(String args[])
    {
        ArithmeticOperations ameer = new ArithmeticOperations();
        System.out.println("Addition = "+ameer.add(34,78));
        System.out.println("Division = "+ameer.division(90,38));
        System.out.println("Multiplication = "+ameer.mulitiply(56,94));
        System.out.println("Subtraction = "+ameer.subract(45,32));
    }


}

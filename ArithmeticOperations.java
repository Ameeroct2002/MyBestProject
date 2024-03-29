public class ArithmeticOperations {
    public int add(int num1, int num2)
    {
        return num1+num2;
    }
    public int subtract(int num3, int num4)
    {
        return num3-num4;
    }
    public float subtract(float num3, float num4)
    {
        return num3-num4;
    }
    public float add(float num1, float num2)
    {
        return num1+num2;
    }
    public int division(int num1, int num2)
    {
        return num1/num2;
    }
    public float division(float num3, float num4)
    {
        return num3/num4;
    }
    public int multiply(int num1, int num2)
    {
        return num1*num2;
    }
    public float multiply(float num3, float num4)
    {
        return num3*num4;
    }
    public static void main(String args[])
    {
        ArithmeticOperations ameer = new ArithmeticOperations();
        System.out.println("Addition = "+ameer.add(34,78));
        System.out.println("Division = "+ameer.division(90,38));
        System.out.println("Multiplication = "+ameer.multiply(56.5f,94.4f));
        System.out.println("Subtraction = "+ameer.subtract(45.55f,32.32f));
        System.out.println("Multiplication = "+ameer.multiply(45,32));
        System.out.println("Subtraction = "+ameer.subtract(45,32));
        System.out.println("Division = "+ameer.division(45.5f,32.44f));
        System.out.println("Addition = "+ameer.add(45.4f,32.3f));
    }


}

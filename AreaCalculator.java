public class AreaCalculator {
    public double calculateRectangleArea(double length, double width)
    {
        return length+ width;
    }
        public double calculateCircleArea(double radius)
    {
        return radius;
    }
        public double calculateTriangleArea(double base, double height)
    {
        return base+height;
    }
        public double calculateSquareArea(double length, double width)
        {
            return length+width;
        }
        public static void main (String args[])
        {
            AreaCalculator ameer = new AreaCalculator();
            System.out.println("Area of a Circle = "+ameer.calculateCircleArea(3.5));
            System.out.println("Area of a Triangle = "+ameer.calculateTriangleArea(2.4,5.6));
            System.out.println("Area of a Square = "+ameer.calculateSquareArea(3.6,4.3));
            System.out.println("Area of a Rectangle = "+ameer.calculateRectangleArea(3.6,2.9));
        }
}

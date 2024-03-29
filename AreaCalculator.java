public class AreaCalculator {
    public double calculateArea(double length, double width)
    {
        return length+ width;
    }
        public double calculateArea(double radius, double height, double width)
    {
        return radius;
    }
        public double calculateArea(float base, float height)
    {
        return base+height;
    }
        public double calculateArea(double length)
        {
            return length*length;
        }
        public static void main (String args[])
        {
            AreaCalculator ameer = new AreaCalculator();
            System.out.println("Area of a Circle = "+ameer.calculateArea(3.5));
            System.out.println("Area of a Triangle = "+ameer.calculateArea(2.4,5.6,4.3));
            System.out.println("Area of a Square = "+ameer.calculateArea(3.6));
            System.out.println("Area of a Rectangle = "+ameer.calculateArea(3.6,2.9));
        }
}

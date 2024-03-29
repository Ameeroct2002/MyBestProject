public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius)
    {
        double f=(9/5*celsius)+32;
        return f;
    }
    public double celsiusToFahrenheit(int celsius)
    {
        double f=(9/5*celsius)+32;
        return f;
    }
    public double fahrenheitToCelsius(double fahrenheit)
    {
        double c=(fahrenheit-32)*5/9;
        return c;
    }
    public double fahrenheitToCelsius(int fahrenheit) {
        double c = (fahrenheit - 32) * 5 / 9;
        return c;
    }
    public static void main (String args[])
    {
        TemperatureConverter ameer = new TemperatureConverter();
        System.out.println("Fahrenheit = "+ameer.celsiusToFahrenheit(34.4));
        System.out.println("Celsius= "+ameer.fahrenheitToCelsius(50.9));
        System.out.println("Fahrenheit = "+ameer.celsiusToFahrenheit(54));
        System.out.println("Celsius= "+ameer.fahrenheitToCelsius(50));
    }
}

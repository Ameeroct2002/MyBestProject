public class ElectricCar extends Car {
double batteryCapacity=4.9;
int chargingTime=45;
String charge()
{
    return "Car is charged";
}
public static void main (String args[])
{
    ElectricCar tesla= new ElectricCar();
    System.out.println(tesla.charge());
    tesla.drive();
}
}

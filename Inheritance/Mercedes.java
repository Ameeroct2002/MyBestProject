package Inheritance;

public class Mercedes extends Car {

        //attributes
        String CarSound;
        String CarName;
        public static void main (String args[])
            {

                //object
                //ClassName objName=new ClassName();
                Car Mercedes = new Car();
                Mercedes.CarSound = "RRRRR";
                Mercedes.CarName = "Toyota";

                Mercedes.CarName = "Audi";
                Mercedes.CarSound = "roaarrr";
                System.out.println(Mercedes.CarSound());
                System.out.println("Color of the dog: " + Mercedes.CarSound);
                Mercedes.display();
            }
        }


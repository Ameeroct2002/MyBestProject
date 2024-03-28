
    public class Dog extends Animal
    {
        //attributes
        String dogName;
        String dogColor;
        public static void main(String args[]){

            //object
            //ClassName objName=new ClassName();
            Dog d=new Dog();
            d.dogColor="white";
            d.dogName="mimmi";

            d.animalName="Dog";
    d.animalSound="bow-bow";
        System.out.println(d.animalAction());
        System.out.println("Color of the dog: "+d.dogColor);
       d.display();


}
}


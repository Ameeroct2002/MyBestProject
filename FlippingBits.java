public class FlippingBits {
    public static void main(String args[])
    {
        int[]array1={0,1,0,0,1,1,0};
        for(int x=0;x< array1.length;x++)
        {
            if (array1[x]==0)
            {
                array1[x]=1;
            }
        }
        for(int y=0;y< array1.length;y++)
        {
            System.out.println("The flipped numbers are ="+array1[y]);
        }
    }
}
/*Animal
{
animalColor;
animalSound()
}

Inheritance -> the process wherein one class acquires the properties of other class.
the class which acquires is called child class and the one from which the properties are
being inherited it is called parent class.

parent/super/base

child/sub/derived

Dog extends Animal {
dogBreed;
Dog d=new Dog();
d.dogBreed;
d.animalColor;
d.animalSound();*/
public class Arrays {
    public static void main (String args[])
    {
    //declaring an array
    int[] marks={77,90,88,86,98};
    String names[] ={"Ameer","Syed","pujitha","nihal"};

    double averages[]={1.4,5.6,7.8};

    int num=10;

    //Accessing array elements using index
		System.out.println(marks[0]);
		System.out.println(names[1]);
    int total = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
		System.out.println("Total marks= "+total);

    //change an elements
    marks[3]=96;
		System.out.println(marks[3]);

    names[3]="siddu";
		System.out.println(names[3]);

}
}
public class Cubing {
    public static void main (String args[])
    {
        double [] array1= {2.3,5.4,3.4,5.8};

        for(int x=0;x<array1.length;x++)
        {
            array1[x]=array1[x]*array1[x]*array1[x];
        }
        for(int y=0;y<array1.length;y++)
        {
            System.out.println("Cubing= "+array1[y]);

    }



    }
}

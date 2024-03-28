public class array {
    public static void main (String args[])
    {
        int [] array={2,4,5,1,7};
        for(int x=0;x<array.length;x++)
        {
            array[x]=array[x]*2;
        }

            System.out.println("Output = ");
            for(int x=0;x< array.length;x++)
            {
                System.out.println(array[x]);
            }
    }
}

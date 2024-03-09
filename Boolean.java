public class Boolean {
    public static void main(String args[])
    {
        int [] array= {24,87,98,23};
        double[] array1={0.5,4.5,3.6,2.9};
        String [] array2={"sat","sun","mon","tue"};
        char [] array3={'a','b','c','d'};
        boolean[] array4={true,false,true,false};
        for (int x = 0; x < array.length; x++)
        {
            System.out.print(array[x] + " ");
            System.out.print(array1[x] + " ");
            System.out.print(array2[x] + " ");
            System.out.print(array3[x] + " ");
            System.out.println(array4[x] + " ");
        }
    }
}

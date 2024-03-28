public class ArrayCalculations {
    public static void main (String args[])
    {
        int []array1={-9,0,7,-3,0,5,-4,-6};
        for(int x=0;x<array1.length;x++)
        {
            if (array1[x]<=0)
            {
                array1[x]=array1[x]*array1[x];
            } else if (array1[x]==0)
            {
                array1[x]=array1[x]+10;
            }
            else if (array1[x]>0)
            {
                array1[x]=array1[x]/2;
            }
        }
        for(int y=0;y<array1.length;y++)
        System.out.println("Calculations are = "+ array1[y]);

    }
}

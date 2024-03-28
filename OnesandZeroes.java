public class OnesandZeroes {
    public static void main (String args[])
    {
        int [] array1={1,0,1,0,1,1,0};
        int count=0;
        int count1=1;
        for(int x=0;x< array1.length;x++)
        {
            if (array1[x]==0)
            {
                count++;
            }
            else if (array1[x]==1)
            {
                count1++;
            }
        }
       System.out.println("Number of zeroes count= "+count);
        System.out.println("Number of ones count= "+count1);
    }
}

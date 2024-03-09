public class CountingOccurences {
    public static void main(String args[])
    {
        int[] array={23,45,25,25,16,64};
        int[] value=new int[6];
        for(int x=0;x<array.length;x++)
        {
            value[x]=array[x];
        }
        for(int y=0;y<value.length;y++)
        {
            System.out.println(value[y]);
        }

    }
}
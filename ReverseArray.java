public class ReverseArray {
    public static void main(String args[])
    {
        int[]array={14,54,92,73,75,94,88};
        int[]array1=new int[7];
        int index=0;
        for (int y=array.length-1;y>=0;y--)
        {
            array1 [index]=array[y];
            index++;
        }
        for(int y=0;y<array1.length;y++)
        {
            System.out.println(array1[y]);
        }
    }
}

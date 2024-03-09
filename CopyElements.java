public class CopyElements {
    public static void main(String args[])
    {
        int[] source={23,45,25,25,16,64};
        int[] dest=new int[6];
        for(int x=0;x<source.length;x++)
        {
            dest[x]=source[x];
        }
        for(int y=0;y<dest.length;y++)
        {
            System.out.println(dest[y]);
        }

    }
}

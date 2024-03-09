public class Counting {
    public static void main(String args[]) {
        int[] source = {12,23,28,94,42,12,86,94,42,97};
        int num=42;
        int count=0;
        for (int x = 0; x < source.length; x++) {
            if (source[x]==num)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}

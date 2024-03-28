public class MinimumArrayElement {
    public static void main(String args[]) {
        int[] a = {12, 45, 23, 67, 34, 87, 96};
        int min_element = a[0];

        for (int i = 1; i < a.length; i++) {


            min_element = Math.min(a[i], min_element);

        }
        System.out.println("Minimum element: " + min_element);
    }
}


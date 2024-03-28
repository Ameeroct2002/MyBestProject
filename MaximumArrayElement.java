public class MaximumArrayElement {
    public static void main(String args[]) {
        int[] a = {12, 45, 23, 67, 34, 87, 96};
        int max_element = a[0];

        for (int i = 1; i < a.length; i++) {
		   /* if(a[i] > max_element){
		        max_element=a[i];
		    }*/

            max_element = Math.max(a[i], max_element);

        }
        System.out.println("Maximum element: " + max_element);
    }
}
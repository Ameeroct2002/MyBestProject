public class Occurences {
    public static void main(String args[]) {
        int oddNumber = 0;
        int evenNumber = 0;
        int positiveNumber = 0;
        int negativeNumber = 0;
        int[] num = {32, 23, 45, 25, 25, 16, 64, 34, 67, 73, 97, 24, 54, 90, 38, 43, 84, 12, 83, 95};
        for (int start = 0; start < num.length; start++) {
            if (num[start] % 2 == 0) {
                evenNumber++;
                System.out.println("It is an even number");
            } else if (num[start] % 2 != 0) {
                oddNumber++;
                System.out.println("It is an odd number");
            } else if (num[start] > 0) {
                System.out.println("It is a positive number");

            } else if (num[start] < 0) {
                System.out.println("It is a negative number");
            }
        }

    }
}

public class EvenNumbers {
    public static void main(String args[]) {
        int[] evenNumbers = {77, 89, 88, 86, 98};
        for(int start=0;start<evenNumbers.length;start++)
        {
         if(evenNumbers[start]%2==0)
         {
             System.out.println(evenNumbers[start]+" is even number");
         }
        }
    }
}

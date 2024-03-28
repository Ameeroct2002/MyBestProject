public class MultiplyArrayOfElements {

public static void main(String args[])
{
    int [] array1={23,34,65,84,94,64};
    int multiply=1;
    for(int x=0;x<array1.length;x++)
    {
        multiply*=array1[x];
    }
    System.out.println(multiply);
}
}

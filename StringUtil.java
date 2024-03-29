public class StringUtil {
    public String concatenate(String str1, String str2)
    {
        return str1+str2;
    }
        public String concatenate(String ameer, String sameer,String pujitha)
        {
            return ameer+sameer+pujitha;
        }
        public String toUpperCase(String str)
        {
            return str.toUpperCase();
        }
        public String toLowerCase(String str)
        {
            return str.toLowerCase();
        }

        public static void main(String args[])
        {
            StringUtil ameer = new StringUtil();
            System.out.println(ameer.concatenate("Pomo","granate"));
            System.out.println(ameer.concatenate("apple","grapes","banana"));
            System.out.println(ameer.toLowerCase("GET"));
            System.out.println(ameer.toUpperCase("bananas"));

        }
}

public class StringUtil {
    public String concatenate(String str1, String str2)
    {
        return str1+str2;
    }
        public String add(String ameer, String sameer)
        {
            return ameer+sameer;
        }
        public String toUpperCase(String str, String str1)
        {
            return str+str1;
        }
        public String toLowerCase(String str, String str2)
        {
            return str+str2;
        }

        public static void main(String args[])
        {
            StringUtil ameer = new StringUtil();
            System.out.println(ameer.concatenate("Pomo","granate"));
            System.out.println(ameer.add("apple","grapes"));
            System.out.println(ameer.toLowerCase("set","get"));
            System.out.println(ameer.toUpperCase("bananas","kiwi"));

        }
}

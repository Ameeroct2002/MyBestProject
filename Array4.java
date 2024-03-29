public class Array4 {
    public class Main
    {
        public static void main(String[] args) {

            int nums[]={88,556,98,82,87,9898,4243,9887,128};

            int x=89;

            int i=0;

            for(i=0;i<nums.length;i++)
            {
                if(nums[i]==x){
                    System.out.println(x+" is found at "+ i +"th position!");
                    break;
                }

            }
            //if index(i) has reached the end , then it means element is not found

            if(i==nums.length)
            {
                System.out.println("element not found!");
            }

        }
    }

}

public class Average {

        public static void main(String[] args) {

            //Declaring
            int arr[]={1,2,3};
            int arr1[]={};

            //classname variable=new classname();
            int nums[]=new int[5];

            String names[]=new String[6];

            double[] averages= new double[6];
            averages[0]=100.0;
            averages[1]=98;
            averages[2]=89.9;
            averages[3]=99;
            averages[4]=89;


            //changing the element
            averages[1]=99;

		/*System.out.println(averages[0]);
		System.out.println(averages[1]);
		System.out.println(a
verages[2]);*/

            //size
            System.out.println(averages.length);

            //printing all the elements
            //for(start;condition;step)

            for(int i=0;i<averages.length;i++)
            {
                System.out.println(averages[i]*10);
            }

            for(int i=0;i<names.length;i++)
            {
                System.out.println(names[i]);
            }

            for(int i=0;i<nums.length;i++)
            {
                System.out.println(nums[i]);
            }


        }
    }

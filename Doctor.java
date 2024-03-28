
    public class Doctor {

        String type="cardiologist";
        int experience;
        Doctor(){
            System.out.println("Default Doctor constructor");
        }

        void display(){
            System.out.println("Senior Doctor");
        }
        public static void main(String args[]){
            Doctor d=new Doctor();
            System.out.println(d.type);
        }
    }


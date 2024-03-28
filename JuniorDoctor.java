public class JuniorDoctor extends  Doctor{
    /*
    Super is used to refer to parent class properties
    super() -->  to call parent class constructor
    super.parentClassAttribute
     */
    JuniorDoctor()
    {
        super();
        System.out.println("Junior Doctor Default Constructor");

    }
    String type="junior cardiologist";

    void display(){
        System.out.println(super.type);
    }

    void getMethod(){
        super.display();
    }
    public static void main(String args[]){

        JuniorDoctor jd=new JuniorDoctor();
        jd.display();
    }
}
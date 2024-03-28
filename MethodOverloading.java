public class MethodOverloading {
    /*
    Multiple methods having
    -> same name
    -> change in arguments
    -> change in return type
     */
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    void add(){
        System.out.println("Add method");
    }
    public static void main(String args[]){

        MethodOverloading load=new MethodOverloading();
        load.add();
        System.out.println(load.add(3,4));
        System.out.println(load.add(50.9,76.99));
        System.out.println(load.add(1,2,3));
    }
}
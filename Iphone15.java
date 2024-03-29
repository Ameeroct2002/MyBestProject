public class Iphone15 extends Iphone14 {
    @Override
    public String turnFlashOn(){
        return "Flash is turned on and sound is on!";
    }

    public static void main(String args[]){
        Iphone15 newModel=new Iphone15();
        System.out.println(newModel.turnFlashOn());
    }
}
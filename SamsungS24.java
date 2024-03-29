public class SamsungS24 extends SamsungS23 {
    public String camera()
    {
        return "Camera has 30 megapixel.";
    }
    public static void main(String args[])
    {
        SamsungS24 s24 = new SamsungS24();
        System.out.println(s24.camera());
    }
}

class Computer
{
    void lan()
    {
        System.out.println("This is lan method to connect to internet");
    }
}
class Laptop extends Computer
{
    void lan()
    {
        System.out.println("This is lan + WIFI method to connect to internet");
    }
    void camera()
    {
        System.out.println("This is inbuilt camera");
    }
}
public class polymorphism {
    static void main(String[] args) {
        Computer lap1= new Laptop();
        lap1.lan();
        //lap1.camera();
    }

}

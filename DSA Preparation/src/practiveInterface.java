interface A
{

    public void print();
}

class C implements A
{

    public void print() {
        System.out.println("this is print method in C class");
    }


    public void println() {
        System.out.println("this is println method");
    }
}
class D extends C
{
    public void print() {
        System.out.println("this is print method in D class");
    }
}
public class practiveInterface {
    static void main(String[] args) {
        A a1= new C();
        A a2= new D();
        a1.print();
        a2.print();
    }



}

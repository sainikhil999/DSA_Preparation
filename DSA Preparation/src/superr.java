
class booper
{
    String s="sainikhil";
    booper()
    {
    System.out.println("this is booper");
    }
    booper(int a,int b)
    {
        System.out.println("sum of a andd b"+ a+b);
    }
    int sum(int a,int b)
    {
        return a+b;
    }
}
class wooper extends  booper
{
    String s="hi";
    wooper(String a)
    {
        super(1,2);
        System.out.println(super.sum(1,2));
     System.out.println("This is wooper method");
     System.out.println("This is super class variable"+super.s);
     this.s=a;
     System.out.println("This is local class variable"+s);
    }

}
public class superr {
    public static void main()
    {
    wooper w= new wooper("sainikhil Gujja");
    }

}
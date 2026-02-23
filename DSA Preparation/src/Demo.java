class Animal
{
    String name,location;
    int age;
}
public class Demo {

    public static void main(String[] args) {
        Animal a1= new Animal();
        a1.age=20;
        a1.name="Tiger";
        a1.location="Bengal";
        Animal a2= new Animal();
        Animal a3= new Animal();
        a2.age=15;
        a2.name="Lion";
        a2.location="Hyd";
        a3.name="Giraffe";
        a3.location="Mumbai";
        a3.age=24;
        Animal[] animalArray= new Animal[3];
        animalArray[0]=a1;
        animalArray[1]=a2;
        animalArray[2]=a3;
        for(Animal a: animalArray)
        {
            System.out.println("Animal name is : "+a.name+" "+"and its age is "+a.age);
        }
    }
}

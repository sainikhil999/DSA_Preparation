import java.util.ArrayList;
import java.util.List;

public class listPractice {
    static void main(String[] args) {
    List<String> stack= new ArrayList<>();
    stack.add("Push");
    stack.add("Pop");
    stack.add("Push1");
    stack.add("Pop1");
    stack.add("Push2");
    stack.add("Push2");
    System.out.println("This is stack remove operation"+stack.remove(3));
    for (String s:stack)
        System.out.println(s);
    }
}

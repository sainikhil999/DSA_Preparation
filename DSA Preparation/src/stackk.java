import java.util.Stack;

public class stackk {
    static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(12);
        stack.push(10);
        stack.push(11);
       // System.out.println(stack.pop());
        String s=" sainikhil gujja ";
        s=s.trim();
        char[] c = s.toCharArray();
       // System.out.println(c.length);
        for(int i=0;i<s.length();i++)
        {
            //System.out.println(c[i]);
        }
        String s1=String.valueOf(c);
        System.out.println(s1);

    }
}

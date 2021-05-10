package stack;
public class StackDemoApp {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        s.show();

        s.pop();
        s.pop();
        System.out.println();

        s.show();
        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();
        s.pop();
        System.out.println();
        s.show();
    }
}

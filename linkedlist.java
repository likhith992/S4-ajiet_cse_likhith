import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>cse =new LinkedList<>();
        cse.add(10);
        cse.add(20);
        cse.addFirst(5);
        cse.addLast(30);
        System.out.println(cse);
        System.out.println(cse.get(1));
    }
}

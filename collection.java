import java.util.LinkedList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>cse =new LinkedList<>();
        cse.add(10);
        cse.add(20);
        cse.addFirst(5);
        cse.addLast(30);
        System.out.println("Normal order: "+cse);
        Collections.sort(cse);
        System.out.println("ascending order:"+cse);
        Collections.sort(cse,Collections.reverseOrder());
        System.out.println("descending order:"+cse);
    }
}

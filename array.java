import java.util.ArrayList;
 public class Main {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("java");
        list.remove(2);
        list.add(1,"ADA");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(0));
    }
}

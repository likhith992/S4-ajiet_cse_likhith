import java.util.HashMap;
 public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap<>();
        m.put(101,"Alex");
        m.put(102,"Stevw");
        System.out.println(m);
        System.out.println(m.size());
        m.remove(102);
        System.out.println(m);
        
    }
}

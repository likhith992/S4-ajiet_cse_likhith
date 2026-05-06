import java.util.TreeMap;
 public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,String> m=new TreeMap<>();
        m.put(101,"Alana");
        m.put(101,"Alex");
        m.put(102,"Stevw");
        System.out.println(m);
        System.out.println(m.size());
        m.remove(102);
        System.out.println(m);
        
    }
}

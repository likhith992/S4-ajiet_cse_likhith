import java.util.HashMap;
 public class Main {
    public static void main(String[] args) {
        String s="college";
        HashMap<Character,Integer> k= new HashMap<>();
        for(char c : s.toCharArray()){
            if(k.containsKey(c)){
                k.put(c,k.get(c)+1);
            }else{
                k.put(c,1);
            }
        }
        System.out.print(k);
    }
}

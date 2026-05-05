import java.util.HashMap;
import java.util.Map;

public class DuplicateFinder {
    public static void main(String[] args) {
        String str = "likhith";
        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1 );
                
            }else{
              charMap.put(ch, 1); 
        }

        System.out.println("Duplicate characters in \""+ str + "\" ":");
        
        for(Map.Entry<Charecter ,Integer> entry: charMap.entrySet()){
    
            if (entry.getValue > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getvalue + " times");
            }
        }
    }
}

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Olivier et Guillaume
 * <p>
 * GitHub link : https://github.com/outerLeitmotiv
 */
public class SortedWords {

    private Map<String, Integer> sortedWords= new TreeMap<String, Integer >();


    public Object put(String key, int num) {
        if (sortedWords.containsKey(key)) {
            return  sortedWords.put(key, num+1);
        }

        else {
           return sortedWords.put(key, num);
        }
    }

    public void printCloud () {

        for (Map.Entry<String, Integer>
                 entry : sortedWords.entrySet())
            System.out.println(
                "[" + entry.getKey()
                + ", " + entry.getValue() + "]");
    }
}

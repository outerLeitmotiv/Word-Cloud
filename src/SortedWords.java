import java.util.Map;
import java.util.TreeMap;

/**
 * @author Olivier
 * <p>
 * GitHub link : https://github.com/outerLeitmotiv
 */
public class SortedWords {

    private TreeMap<String, Integer> sortedWords= new TreeMap<String, Integer >();


    public int put(String key) {
      /*  if (sortedWords.containsKey(key)) {
            return sortedWords.put(key,sortedWords.remove(key)+1);
        } else { */
           return sortedWords.put(key, 1);
    //    }
    }

    public void printCloud () {

        for (Map.Entry<String, Integer>
                 entry : sortedWords.entrySet())
            System.out.println(
                "[" + entry.getKey()
                + ", " + entry.getValue() + "]");
    }
}

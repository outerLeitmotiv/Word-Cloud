
/**
 * @author Olivier
 * <p>
 * GitHub link : https://github.com/outerLeitmotiv
 */
public class main {
    public static void main (String args[]) {
       SortedWords test = new SortedWords();
       test.put("salut", 1);
       test.put("salut", 1);
       test.put("Arthur", 1);

       test.printCloud();
    }
}

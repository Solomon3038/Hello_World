package ParserExample;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;


public class ParserUtil {

    //Map for storing lexems: String - lexem, Integer - count
    static HashMap<String, Integer> countsOfWords = new HashMap<String, Integer>();

    //sortin map by value
    private static List SortMap(HashMap<String, Integer> map) {
        List entryList = new ArrayList(map.entrySet());
        Collections.sort(entryList, new ValuesComparator());
        return entryList;
    }

    //method for adding lexem to the map
    public static void AddWordToHashMap(String newWord) {

        if (countsOfWords.containsKey(newWord)) {
            Integer count = countsOfWords.get(newWord);
            count++;
            countsOfWords.put(newWord, count);
        } else {
            Integer count = 1;
            countsOfWords.put(newWord, count);
        }
    }

    //write result into the file
    public static void GenerateReport(BufferedWriter writer) throws IOException {
        List entryList = ParserUtil.SortMap(countsOfWords);
        Entry<String, Integer> entry;
        for (Iterator itr = entryList.iterator(); itr.hasNext();) {
            entry = (Entry<String, Integer>) itr.next();
            writer.write(entry.getKey() + "=" + entry.getValue() + " ");
        }
        writer.close();

    }

}

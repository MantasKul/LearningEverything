package leetcodeEasy;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class RemoveLetterToEqualizeFrequency {
    public boolean equalFrequency(String word) {
        Hashtable<Character, Integer> charMap = new Hashtable<Character, Integer>();

        for(Character c : word.toCharArray()) {
            if(!charMap.containsKey(c)) charMap.put(c, 1);
            else charMap = addToCharMap(charMap, c);
        }

        TreeMap<Integer, Integer> frequency = new TreeMap<>();
        Set<Character> keySet = charMap.keySet();

        for(Character c : keySet) {
            if(!frequency.containsKey(charMap.get(c))) frequency.put(charMap.get(c), 1);
            else {
                int v = frequency.get(charMap.get(c));
                v++;
                frequency.put(charMap.get(c), v);
            }
        }

        // If there are 2 frequencies and the higher frequency is higher by 1 AND there's only one of it return true
        if (frequency.size() == 2 && frequency.firstKey() + 1 == frequency.lastKey() && frequency.get(frequency.lastKey()) == 1) {
            return true;
        }
        // If there's only one of frequency 1 return true (1,x)
        if (frequency.size() == 2 && frequency.firstKey() == 1 && frequency.get(frequency.firstKey()) == 1) {
            return true;
        }
        // If there's same ammount of all the letters and their frequency is one or there's only one letter return true
        if (frequency.size() == 1) {
            if (frequency.firstKey() == 1 || frequency.get(frequency.firstKey()) == 1) {
                return true;
            }
        }
        return false;
    }

    public Hashtable addToCharMap(Hashtable<Character, Integer> map, Character key) {
        Integer i = map.get(key);
        i++;
        map.put(key, i);
        return map;
    }
}

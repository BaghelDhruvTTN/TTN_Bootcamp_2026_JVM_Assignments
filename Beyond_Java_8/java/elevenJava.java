/*Demonstrate the use of firstEntry(), lastEntry(), pollFirstEntry(), pollLastEntry(),
putFirst(), putLast(), reversed() with SequencedMap.
 */
import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class elevenJava {
    public static void main(String[] args) {

        SequencedMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // firstEntry & lastEntry
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());


        // putFirst & putLast
        map.putFirst(0, "Zero");
        map.putLast(4, "Four");

        System.out.println(map);
        // 0=Zero, 1=One, 2=Two, 3=Three, 4=Four

        // pollFirstEntry & pollLastEntry
        System.out.println(map.pollFirstEntry()); // 0=Zero
        System.out.println(map.pollLastEntry());  // 4=Four

        System.out.println(map);
        // =One, 2=Two, 3=Three

        // reversed view
        SequencedMap<Integer, String> reversedMap = map.reversed();
        System.out.println(reversedMap);
        // 3=Three, 2=Two, 1=One
    }
}

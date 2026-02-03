import java.util.ArrayList;
import java.util.List;

/*
Create Unmodifiable List from a Steam
 */
public class thirdQues {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(36);
        list.add(25);
        list.add(65);
        list.add(12);

        // toList method here used to create immutable list
        List<Integer> ans=  list.stream().map(e -> e+1) . toList();

        //ans.add(10);
        System.out.println(ans);
    }

}

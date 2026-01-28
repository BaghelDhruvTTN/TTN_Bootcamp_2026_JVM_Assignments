package JVM_TTN_Assignments.Collections_Assignment.solution_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution_1 {
    public static void main(String[] args) {
        
        List <Float> list = new ArrayList<Float>();
        list.add(0,1f);
        list.add(1,3f);
        list.add(2,5f);
        list.add(3,7f);
        list.add(4,9f);

        Iterator <Float> it = list.iterator();
        float Sum=0f;
        while(it.hasNext()){
            Sum+= it.next();
        }
        System.out.println("The Sum of the elements of the List is : " + Sum);
    }

    
}

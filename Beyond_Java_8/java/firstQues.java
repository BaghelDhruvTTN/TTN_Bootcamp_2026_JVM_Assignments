/*
Convert an Optional type into Stream
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class firstQues {
    public static void main(String[] args) {
        Optional<Integer> opt = Optional.of(10);

        List<Integer> ans = opt.stream().toList();
        System.out.println(ans);
    }
}

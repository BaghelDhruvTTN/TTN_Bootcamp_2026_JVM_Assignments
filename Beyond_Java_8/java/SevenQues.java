import java.util.List;
import java.util.stream.Stream;

/*
Use iterator stream method to generate a stream
 */
public class SevenQues {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(0, i-> i<=100, i-> i+1).toList();

        System.out.println(list);
     }
}

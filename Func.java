import java.util.ArrayList;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.concat;

public class Func {

    public static int nOcorrencias(ArrayList<Integer> l, Integer el){
        int n = 0;
        for (Integer i : l) {
            if (i.equals(el)) {
                n++;
            }
        }
        return n;
    }

    public static boolean hasRepeat(ArrayList< Integer > l){
        for (Integer i : l) {
            if (nOcorrencias(l, i) > 1) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        // if no need to remove duplicates, just remove .distinct()
        return new ArrayList<>(concat(l1.stream(), l2.stream()).distinct().collect(toList()));
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        // if no need to remove duplicates, just remove .distinct()
        return new ArrayList<>(l1.stream().distinct().filter(l2::contains).collect(toList()));
    }

}

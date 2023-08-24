import java.util.ArrayList;
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

}

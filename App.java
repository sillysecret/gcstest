import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(Func.nOcorrencias(list, 2));
        System.out.println(Func.hasRepeat(list));

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(Func.union(list, list2));
        System.out.println(Func.intersect(list, list2));
    }
}
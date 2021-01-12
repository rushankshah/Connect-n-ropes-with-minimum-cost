import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConnectNRopesMinCost {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(245);
        list.add(454);
        list.add(324);
        list.add(894);
        list.add(98);
        Collections.sort(list);
        int minCost = 0;
        while (list.size() > 1) {
            minCost += list.get(0) + list.get(1);
            System.out.println(list);
            int tempSum = list.get(0) + list.get(1);
            list.add(tempSum);
            list.remove(0);
            list.remove(0);
            Collections.sort(list);
        }
        System.out.println(minCost);
    }
}

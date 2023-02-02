import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(5);
        integerList.add(6);

        for (int i = 0; i < integerList.size() - 1; i++) {
            if (integerList.get(i) != integerList.size()) {
                if (integerList.get(i)!= 3 && integerList.get(i)!= 4 ) {
                    integerList.remove(integerList.get(i));
                }
            }
        }
        System.out.println(integerList);
    }
}

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringExample2 {



    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Nhập từ cần check");
        String str = (String) input.nextLine();

        ArrayList<String> arr = new ArrayList<>();

        for (String element: str.split(" ")) {
            System.out.println(element);
            arr.add(element);
        }
//        System.out.println(arr);

        int value = 1;

        Map<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (treeMap.containsKey(arr.get(i))) {
                treeMap.put(arr.get(i),++value);
                continue;
            }
            treeMap.put(arr.get(i),value);
        }

        System.out.println(treeMap);




    }
}
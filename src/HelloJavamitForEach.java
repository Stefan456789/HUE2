import java.util.ArrayList;
import java.util.List;

public class HelloJavamitForEach {
    public static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(System.out::println);

    }
}

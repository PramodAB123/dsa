import java.util.ArrayList;
import java.util.List;

public class inter350 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("apple", "banana", "orange","banana"));
        list.remove("banana"); // removes the first occurrence of "banana"
        System.out.println(list); // [apple, orange]

    }
}

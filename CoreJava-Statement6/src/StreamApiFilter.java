import java.util.*;
import java.util.stream.*;

public class StreamApiFilter {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "Jdbc", "Thymeleaf", "SpringBoot", "Hibernet");

        List<String> result = names.stream().filter(s -> s.startsWith("J")).collect(Collectors.toList());
        System.out.println(result);

    }

}

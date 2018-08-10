import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TextWordsCounter {

    public static void main(String[] args) throws IOException {

        System.out.println(new StringBuilder(new String("abcd")).reverse());
        Map<String, Long>
                collect =
                Files.lines(Paths.get("/root/work/testforwordscounter.txt"))
                     .map(string -> string.split("\\s"))
                     .map(Arrays::stream)
                     .flatMap(stringStream -> stringStream)
                     .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        mapPrinter(collect);

    }

    private static void mapPrinter(Map<String, Long> map) {
        System.out.println("WORD            |           count of use");
        for (Map.Entry<String, Long> wordCounterPair : map.entrySet()) {
            System.out.println(wordCounterPair.getKey() + " ---------------------------" + wordCounterPair.getValue());
        }
        System.out.println(map.size());
    }
}

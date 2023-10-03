import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Solution {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("abd");
        list1.add("aa");
        list1.add("bv");
        list1.add("ss");
        list1.add("gg");
        list1.add("hh");



        List<String> list2 = new ArrayList<>();
        list2.add("abd");
        list2.add("aa");
        list2.add("bv");
        list2.add("ss");
        list2.add("gg");
        list2.add("zz");



        List<String> results = compareLists(list1, list2);

        results.forEach(System.out::println);
    }



    private static List<String> compareLists(List<String> list1, List<String> list2) {
        return IntStream.range(0, Math.min(list1.size(), list2.size()))
                .mapToObj(i -> list1.get(i).equals(list2.get(i)) ? "YES" : "NO")
                .collect(Collectors.toList());
    }
}


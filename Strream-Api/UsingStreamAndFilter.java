import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.jar.JarOutputStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStreamAndFilter {
    public static void main(String[] args) {

        List<String> name = List.of("Darshan", "Ananda", "Dr.Basavaraj", "Dr.komal");
        List<String> newFilteredList = name.stream().filter(e -> e.startsWith("D")).collect(Collectors.toList());

        System.out.println("the new filtered list is " + newFilteredList);

        List<Integer> numberOfInteger = List.of(2, 4, 6, 8, 12);

        Set<Integer> newInteger = numberOfInteger.stream().map(e -> e * e).collect(Collectors.toSet());
        System.out.println("the new set of the Integer variable is " + newInteger);


        newInteger.stream().forEach(e -> {
                    System.out.println("the e " + e);
                }
        );
        numberOfInteger.stream().forEach(e -> {
            System.out.println("the for each number is " + e);
        });


        List<Integer> sortedInteger = newInteger.stream().sorted().collect(Collectors.toList());

        System.out.println("sorted integer is " + sortedInteger);

        newInteger.stream().sorted().forEach(e -> {
            System.out.println("the sorted numebr is " + e);
        });
        Integer maxNumber = newInteger.stream().max((x, y) -> x.compareTo(y)).get();

        System.out.println("the output of the mx number is " + maxNumber);

        Integer minNumber = newInteger.stream().min((x, y) -> x.compareTo(y)).get();

        System.out.println("the min number is" + minNumber);

        Student s1 = new Student(1, "darshan", "science", 100);
        Student s2 = new Student(2, "basavaraj", "science", 50);
        Student s3 = new Student(3, "Anand", "science", 80);
        Student s4 = new Student(4, "bishnu", "science", 70);


        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);


//the student marks greator than the 50 using the filer

        studentList.stream().filter(student -> student.getMarks() > 50).forEach(student -> {
            System.out.println("the student is " + student);
        });


        List<Student> studentSorted = studentList.stream().sorted(Comparator.comparingInt(Student::getMarks)).collect(Collectors.toList());

        studentSorted.stream().forEach(e -> {
            System.out.println("the sorted student is  " + e);
        });

        List<Student> sortedInMax = studentList.stream().max(Comparator.comparingInt(Student::getMarks)).stream().collect(Collectors.toList());

        sortedInMax.stream().forEach(e -> {
            System.out.println("the sorted variable based on the  max  marks " + e);
        });


        System.out.println("--------------------------------------------------------------------");


        List<Integer> IntegerNumber = List.of(6, 7, 8, 9, 10);

        IntegerNumber.stream().map(e -> (e + 800)).forEach(e -> {
            System.out.println("the Output of the INteger added is " + e);

        });

        for (int n : IntegerNumber) {
            System.out.println("the integer number is " + n);
        }


        String arrayString = "Apple Orange Banana Orange Banana grapes";


        List<String> uniqueWords = Arrays.stream(arrayString.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("the unique words are: " + uniqueWords);
    }


}

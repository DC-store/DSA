import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringOperationUsingJava8 {


    public static void main(String[] args) {
        //Write a Java method that will remove a given character from a string object.
        String s = "Darshan";

        char charToRemove= 'a';

        String exte = """ 
                darshan is a "good boiy"
                """;
        
        //remove the a
      String result = s.chars().filter(e->e!=charToRemove)
              .collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append)
              .toString();

              System.out.println("the result of the String Built is "+result);
        //maximum occuring character


        String str= "darshan";

        char x = str.chars()
                .mapToObj(e->(char)e)
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();

        System.out.println("the most repeating is "+x);

        //How to remove all duplicates from a given string?

        String input ="darshan";

        String distinct = input.chars()
                .distinct().mapToObj(e->String.valueOf((char)e)).collect(Collectors.joining());

        System.out.println("the distinct is charater "+distinct);


        //How to remove characters from the first String which are present in the second String?

        String firstString ="Hello world";
        String secondString ="world";

        String finalSttring =firstString.chars().
                mapToObj(c->(char)c).
                filter(c->!secondString.contains(String.valueOf(c)))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("the output of the How to remove characters from the first String which are present in the second String :::: "+finalSttring);



       //Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

        List<Integer> integrList= new ArrayList<>();
        integrList.add(2);
        integrList.add(3);
        integrList.add(4);
        integrList.add(5);
        integrList.add(7);
        integrList.add(8);

        List<Integer> evenNumbers = integrList.stream()
                .filter(value -> value % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("the strem of the integerList is "+evenNumbers);

        List<Integer> integerList2= List.of(2,3,4,5,6,7,8,6,1,100);
        List<String> digitEnd =integerList2.stream().map(e->{
            String f = e.toString();
            return f;
        }).filter(e->e.startsWith("1")).collect(Collectors.toList());


        List<String> digitEn2d =integerList2.stream().map(e->e.toString())
                .filter(e->e.startsWith("1")).collect(Collectors.toList());





        System.out.println("number that startes with 1111111"+digitEn2d);

        List<Integer> modifiedNumbers = integrList.stream()
                .map(value -> {
                    if (value%2 == 0) {
                        return value+100;
                    } else {
                        return value;
                    }
                })
                .toList();

        modifiedNumbers.forEach(System.out ::println);




        //How to find duplicate elements in a given integers list in java using Stream functions


        List<Integer> duplicateElemnt = List.of(2,8,9,2,0,1,100,200,22,11,22);

       List<Integer> singleInteger= duplicateElemnt.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                .stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("the elelment whihc is duplicat is "+singleInteger);


        //Given the list of integers, find the first element of the list using Stream functions

        List<Integer> frstElementFinding = List.of(2,8,9,2,0,1,100,200,22,11,22);

        System.out.println("the first element is "+frstElementFinding.stream().findFirst().get());

        // Given a list of integers, find the total number of elements present in the list using Stream functions

 ;

        System.out.println("the count is "+frstElementFinding.stream().mapToInt(e->e= frstElementFinding.size()
        ).findAny());

//Given a list of integers, find the maximum value element present in it using Stream functions

        System.out.println("the maximum number value of the element is "+frstElementFinding.stream().max(Integer::compare).get());



        //Given a String, find the first non-repeated character in it using Stream functions

        String norepeatation = "darshan";

      //  norepeatation.chars().mapToObj(Collectors.groupingBy(Function.identity(),Collectors.counting())).min(Map.Entry.comparingByValue(),Comparator::comparingInt).map(Map.Entry::getKey)
       //

     char c=  norepeatation.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                .stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().get();

        System.out.println("the non repeated character using the java 8 is "+c);


        norepeatation.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1)
                .map(Map.Entry::getKey).findFirst().get();



        //Given a String, find the first repeated character in it using Stream functions


        String frstRepetedChar= String.valueOf(norepeatation.toLowerCase().chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                .stream().filter(e->e.getValue()>1).findFirst());

        System.out.println("the frst repested character is "+frstRepetedChar);

        //Given a list of integers, sort all the values present in it using Stream functions



        List<Integer> needofSortingElement = List.of(6,8,10,9,1,0,2,3,5);

         List<Integer> theSorted=needofSortingElement.stream().sorted().collect(Collectors.toList());
        System.out.println("the sorted element is "+theSorted);



//Given a list of integers, sort all the values present in it in descending order using Stream functions
       List<Integer> descendingSort=needofSortingElement.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("the descending sorting element "+descendingSort);

     //   Java 8 program to perform cube on list elements and filter numbers greater than 50.


        List<Integer> load = Arrays.asList(2,10,8,50,55,100);

 List<Integer> GFD=   load.stream().filter(w-> w<50).collect(Collectors.toList()).stream().map(f->f*f*f).collect(Collectors.toList());

        System.out.println(" Java 8 program to perform cube on list elements and filter numbers greater than 50.   "+GFD);

        //Write a Java 8 program to sort an array and then convert the sorted array into Stream

        List<Integer> load2 = Arrays.asList(600,2,10,8,50,55,100);

       Stream<Integer> stream= load2.stream().sorted().collect(Collectors.toList()).stream();

                stream.forEach(kk-> System.out.print(" "+kk+" "));

    //How to use map to convert object into Uppercase in Java 8

        List<String> nameList= new ArrayList<>();
        nameList.add("sharath");
        nameList.add("Baharath");
        nameList.add("names");
        nameList.add("Madhu");
        System.out.println();
        nameList=nameList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        nameList.forEach(outputvar-> System.out.println(outputvar+""));

        //How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order.

        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(5, "darshan", "science", 100);
        Student s2 = new Student(2, "basavaraj", "science", 50);
        Student s3 = new Student(1, "Anand", "science", 80);
        Student s4 = new Student(4, "bishnu", "science", 70);
        Student s5 = new Student(8, "ananda", "science", 70);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        //1)sort based on the id reverse order
        //2)sort based on the marks
        //3) sort based on the Length of the name


       List<Student> sortedBasedOntheMarks= studentList.stream().sorted(Comparator.comparingInt(Student::getMarks)).collect(Collectors.toList());
        System.out.println("comparing based on the int");
       sortedBasedOntheMarks.forEach(System.out::println);
        System.out.println(" ");
        System.out.println("");
     List<Student> nameSorted=  studentList.stream().sorted(Comparator.comparingInt(student->student.getName().toLowerCase().length())).collect(Collectors.toList()).reversed();




        nameSorted.forEach(v-> System.out.println(v));

        System.out.println();
        System.out.println();
        studentList.stream().sorted(Comparator.comparingInt(Student::getId).reversed()).collect(Collectors.toList()).forEach(printing-> System.out.println(printing));

        //finding the maximum marks in the Student


        System.out.println("comparing the marks and getting highest marks object "+studentList.stream().max(Comparator.comparingInt(Student::getMarks)).get());;










    }





        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?





}

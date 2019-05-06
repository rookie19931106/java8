package jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author jay
 * @date 2019/5/6 22:33
 */
public class StreamTest2 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("hello", "world");
//        //接收一个函数式接口
//        String[] array = stream.toArray(String[]::new);
//        Arrays.asList(array).forEach(System.out::println);
        Stream<String> stream = Stream.of("hello", "world", "the world");
//        List<String> collect = stream.collect(() -> new ArrayList<>(),
//                (theList, item) -> theList.add(item),
//                (theList1, theList2) -> theList1.addAll(theList2));
        LinkedList<String> collect = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
        collect.forEach(System.out::println);

    }
}

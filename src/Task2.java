import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args){
        List<String> list= Arrays.asList("albert","jeame","kyle","ab","albert","nebi");
        List<String> list1=list.stream().filter(n->n.length()>3).sorted(Comparator.comparingInt(String::length).reversed()).limit(3).distinct().collect(Collectors.toList());
        System.out.println(list1);
    }
}

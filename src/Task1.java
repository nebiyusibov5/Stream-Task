import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        List<Integer> list1=list.stream().filter(x->x%2==0).map(n->n*n).collect(Collectors.toList());
        System.out.println(list1);
    }
}

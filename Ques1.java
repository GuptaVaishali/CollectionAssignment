import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ques1 {
    public static void main(String[] args) {
        List<Float> numbers = new LinkedList<>();

        numbers.add(3.5f);
        numbers.add(4.7f);
        numbers.add(2.9f);
        numbers.add(3.567f);
        numbers.add(23.45f);

        float sum = 0;
        Iterator<Float> it = numbers.iterator();
        while(it.hasNext()){
            sum = sum + it.next();
        }
        System.out.println("Sum = " + sum);
    }
}

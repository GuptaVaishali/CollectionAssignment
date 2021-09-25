import java.text.SimpleDateFormat;
import java.util.Date;

public class Ques8 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-YYYY");
        System.out.println(formatter.format(today));
    }
}

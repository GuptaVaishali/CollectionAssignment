import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ques9 {
    public static void main(String[] args) {
        Date d = new Date();
        Locale list[] = DateFormat.getAvailableLocales();
        for (Locale aLocale : list) {
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, aLocale);
            DateFormat df1 = DateFormat.getTimeInstance(DateFormat.FULL, aLocale);
            System.out.print(df.format(d) + " ");
            System.out.println(df1.format(d));
        }
    }
}

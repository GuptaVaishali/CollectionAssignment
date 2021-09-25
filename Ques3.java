import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter A String");
        String str = sc.nextLine();

        Map<Character,Integer> mp;
        mp = countFrequency(str);

        mp.forEach((key,val) -> System.out.println("Frequency of Character " +  key + " is =  " +  val));
    }

    static Map<Character,Integer> countFrequency(String str){
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!mp.containsKey(ch))
                mp.put(ch,1);
            else{
                int val = mp.get(ch);
                mp.put(ch,++val);
            }
        }
        return mp;
    }

}

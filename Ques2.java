import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        System.out.println("Number of unique characters in string " + str + " is = "
                + countUniqueChar(str));
    }

    static int countUniqueChar(String str){
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
                count++;
            }
            else
                count--;
        }
        return count;
    }
}

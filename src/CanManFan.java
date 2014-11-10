import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 05.11.14.
 */
public class CanManFan {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[cfm]an");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.next();
            Matcher mat = pat.matcher(str);
            System.out.println(mat.matches());
        }
    }
}

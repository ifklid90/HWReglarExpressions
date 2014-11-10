import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.11.14.
 */
public class ABC {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("a*b*c*");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.next();
            Matcher mat = pat.matcher(str);
            System.out.println(mat.matches());
        }
    }
}

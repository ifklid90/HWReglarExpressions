import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.11.14.
 */
public class AnnaMaria {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[A-Z][a-z]+a");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.next();
            Matcher mat = pat.matcher(str);
            System.out.println(mat.matches());
        }
    }
}

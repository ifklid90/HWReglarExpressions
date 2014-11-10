import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.11.14.
 */
public class Email {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.next();
            Matcher mat = pat.matcher(str);
            System.out.println(mat.matches());
        }
    }
}

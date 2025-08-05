import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9.%_]+@[a-zA-Z]+\\.[a-z]{2,}$");
        Pattern passwordPattern=Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");

        System.out.println("Enter the email: ");
        String email= sc.next();
        Matcher matcher = emailPattern.matcher(email);
        System.out.println(matcher.matches());
        System.out.println("Enter the password: ");
        String password= sc.next();
        Matcher matcher2 = passwordPattern.matcher(password);
        System.out.println(matcher2.matches());




    }
}
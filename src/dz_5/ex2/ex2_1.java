package dz_5.ex2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ex2_1 {
    public static void main(String[] args) {
        String str1 = "Мой номер телефона +375-29-1234567. " +
                "Мой ник в телеграмм @TheGodFather.";
Pattern p = Pattern.compile("([0-9]{7})|([a-zA-Z])");
Matcher matcher = p.matcher(str1);
        while(matcher.find())
            System.out.printf(matcher.group());
    }
}

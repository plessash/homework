package dz_5.ex2_2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBookTextsearch implements Findable {
    int count1=0;
    @Override
    public int countWord(String word, String text) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count1++;
            }
        System.out.println(count1);
        return 0;
    }
}
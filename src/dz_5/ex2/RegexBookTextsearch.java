package dz_5.ex2;
import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
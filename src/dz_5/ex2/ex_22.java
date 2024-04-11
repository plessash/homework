package dz_5.ex2;
import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex_22 {
    public static void main(String[] args) {
        String str1 = null;
        try {
            Path path = Paths.get("src/dz_5/Voina i Mir.txt");
            str1 = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pattern pattern = Pattern.compile("мирный");
        Matcher matcher = pattern.matcher(str1);
        while (matcher.find()) {
            System.out.println("Полное соответствие: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Группа " + i + ": " + matcher.group(i));

            }
        }
    }
}
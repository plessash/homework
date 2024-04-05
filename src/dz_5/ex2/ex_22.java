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
            try {
                Path path = Paths.get("src/dz_5/ex2/Voina i Mir.txt");
                String str1 = Files.readString(path);
                Pattern p = Pattern.compile("В");
                Matcher matcher = p.matcher(str1);
                System.out.println(matcher.group());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

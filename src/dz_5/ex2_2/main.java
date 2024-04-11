package dz_5.ex2_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main {
    public static void main(String[] args) {
        String text = null;
        try {
            Path path = Paths.get("src/dz_5/Voina i Mir.txt");
            text = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
Findable simple = new SimpleBookTextSearch();
        simple.countWord("война", text);
Findable regex = new RegexBookTextsearch();
        regex.countWord("кричал",text);
    }
}
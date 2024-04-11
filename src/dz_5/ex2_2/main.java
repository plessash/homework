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
SimpleBookTextSearch simpleBookTextSearch = new SimpleBookTextSearch();
simpleBookTextSearch.countWord("война",text);
RegexBookTextsearch regexBookTextsearch = new RegexBookTextsearch();
regexBookTextsearch.countWord("кричал",text);
    }
}
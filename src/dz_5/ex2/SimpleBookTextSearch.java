package dz_5.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SimpleBookTextSearch implements Findable {
    int count = 0;
    @Override
    public int countWord(String word, String text) {
        for (int index = text.indexOf(word);
             index >= 0;
             index = text.indexOf(word, index + 1)) {
             count ++;
        }
        System.out.println(count);
        return 0;
    }
}
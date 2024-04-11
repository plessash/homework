package dz_5.ex2;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.awt.SystemColor.text;

public class ex2_2 {

    public static void main(String[] args) throws FileNotFoundException {
        String currentString = new String();
        String path = "src/dz_5/Voina i Mir.txt";
        Scanner scanner = new Scanner(new File("src/dz_5/Voina i Mir.txt"));
        while (scanner.hasNextLine()) {
            currentString = scanner.nextLine();
        }
        scanner.close();
        Pattern p = Pattern.compile("К");
        Matcher matcher = p.matcher(currentString);
        System.out.println(currentString);
        while (matcher.find()) {
            System.out.print(matcher.group());

        }
    }

}



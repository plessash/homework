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

String path = "src/dz_5/ex2/Voina i Mir.txt";
File file = new File(path);
Scanner scanner = new Scanner(file);
while (scanner.hasNextLine())

    System.out.println(scanner.nextLine());
Pattern p = Pattern.compile("");
Matcher matcher = p.matcher();
        }
    }



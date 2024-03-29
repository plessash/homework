package dz_4;

import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
        int[] massive = new int[100_000];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = ((int) (Math.random() * 100_000));
        }
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    temp = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        a = massive[a];
        int b = in.nextInt();
        b = massive[b];
        for (int i = a; i < b; i++) {
            System.out.println(massive[i]);

        }
    }
}



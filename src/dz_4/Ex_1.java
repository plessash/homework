package dz_4;

import java.util.Random;

public class Ex_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(1_000_000, 2_000_000);
        int[] massive = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            massive[i] = 1_000_000 + i;
        }
        System.out.println(program(massive, randomInt));
    }

    public static int program(int[] massive, int randomInt) {
        int left = 0;
        int right = massive.length - 1;
        for (; left <= right; ) {
            int mid = left + (right - left) / 2;
            int number = massive[mid];
            if (randomInt == number) {
                return mid;
            }
            if (number < randomInt) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}



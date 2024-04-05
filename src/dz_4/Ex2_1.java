package dz_4;

public class Ex2_1 {
        public static void main(String[] args) {
            int[] massive = new int[100_000];
            for (int i = 0; i < massive.length; i++) {
                massive[i] = ((int) (Math.random() * 100_000));
            }
            int temp;
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < massive.length-1; i++) {
                    if (massive[i] > massive[i + 1]) {
                        temp = massive[i];
                        massive[i] = massive[i + 1];
                        massive[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
             for (int i =0; i< massive.length; i++){
                 System.out.println(massive[i]);
                 System.out.println(2 + 2 + " = 4");
            }
        }
    }

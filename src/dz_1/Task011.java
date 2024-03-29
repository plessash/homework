package dz_1;
public class Task011 { //таблица умножения
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                int result = i*j;
                System.out.print(result + "\t");
            }
            System.out.println();
            }
        }
    }
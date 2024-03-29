package dz_2;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Car car = new Car(72.1F, "B",
                new Engine("N52", 3000, "AI95"),
                new Wheels("BBS",17,Season.SUMMER),
                new Seeds(4), new Lock(new LockKey(1111)));
        Driver driver = new Driver(2,"B", (new DriverKey(1122)));
        System.out.println(driver);
        System.out.println(car);

        boolean keyValid1 = car.isKeyValid(driver); //3.1.Сверка ключа
        System.out.println(keyValid1);

        boolean categoryValid = car.isDriverCanDriveACar(driver); //3.2 Сверка категории прав
        System.out.println(categoryValid);

        System.out.println("Введите количество пассажиров: "); //3.3 Проверка мест
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        if (numb <= car.amountSeeds()) {
            System.out.println("Ок, Едем!");
        } else {
            System.out.println("Мест нет");
        }
    }
}



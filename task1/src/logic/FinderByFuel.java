package logic;
import domain.*;
import java.util.Scanner;
public class FinderByFuel {
    public static void find() {
        int low,high,t,i;
        Database.setFighterArray(Database.fighterArray);
        Database.setBomberArray(Database.bomberArray);
        Database.setCargoArray(Database.cargoArray);
        Database.setPassengerArray(Database.passengerArray);
        Database.setCommonArray(Database.commonArray);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нижнюю границу потребления топлива на милю:\n");
        low = scanner.nextInt();
        System.out.println("Введите верхнюю границу потребления топлива на милю:\n");
        high = scanner.nextInt();
        for(i=0;i<4;i++) {
            for (t = low; t < high; t++) {
                if (Database.bomberArray[i].getFuelCount()==t) {
                    System.out.println("Найден самолет типа " + PlaneType.BOMBER + "потребляющий" + Database.bomberArray[i].getFuelCount() + "топлива на милю");
                }
                else if (Database.fighterArray[i].getFuelCount()==t) {
                    System.out.println("Найден самолет типа " + PlaneType.FIGHTER + "потребляющий" + Database.fighterArray[i].getFuelCount() + "топлива на милю");
                }
                else if (Database.passengerArray[i].getFuelCount()==t) {
                    System.out.println("Найден самолет типа " + PlaneType.PASSENGER + "потребляющий" + Database.passengerArray[i].getFuelCount() + "топлива на милю");
                }
                else if (Database.cargoArray[i].getFuelCount()==t) {
                    System.out.println("Найден самолет типа " + PlaneType.CARGO + "потребляющий" + Database.cargoArray[i].getFuelCount() + "топлива на милю");
                }
            }
        }
        scanner.close();
    }
}

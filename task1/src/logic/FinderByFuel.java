package logic;

import domain.*;

import java.util.Scanner;

public class FinderByFuel {
    public static void find(Scanner scanner) {
        Database.setFighterArray();
        Database.setBomberArray();
        Database.setCargoArray();
        Database.setPassengerArray();
        Database.setCommonArray();

        System.out.println("Введите нижнюю границу потребления топлива на милю:\n");
        int low = scanner.nextInt();
        System.out.println("Введите верхнюю границу потребления топлива на милю:\n");
        int high = scanner.nextInt();
        for (int i = 0; i < 4; i++) {
            if ((Database.bomberArray[i].getFuelCount() >= low) && (Database.bomberArray[i].getFuelCount() <= high)) {
                System.out.println("Найден самолет типа " + PlaneType.BOMBER + " потребляющий " + Database.bomberArray[i].getFuelCount() + " л топлива на милю");
            } else if ((Database.fighterArray[i].getFuelCount() >= low) && (Database.fighterArray[i].getFuelCount() <= high)) {
                System.out.println("Найден самолет типа " + PlaneType.FIGHTER + " потребляющий " + Database.fighterArray[i].getFuelCount() + " л топлива на милю");
            } else if ((Database.passengerArray[i].getFuelCount() >= low) && (Database.passengerArray[i].getFuelCount() <= high)) {
                System.out.println("Найден самолет типа " + PlaneType.PASSENGER + " потребляющий " + Database.passengerArray[i].getFuelCount() + " л топлива на милю");
            } else if ((Database.cargoArray[i].getFuelCount() >= low) && (Database.cargoArray[i].getFuelCount() <= high)) {
                System.out.println("Найден самолет типа " + PlaneType.CARGO + " потребляющий " + Database.cargoArray[i].getFuelCount() + " л топлива на милю");
            }
        }
    }
}

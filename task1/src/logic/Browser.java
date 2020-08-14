package logic;

import domain.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Browser {
    public void browse() {
        int num;
        boolean flag = true;
        int volumeAll = Summator.getVolumeAll();
        int weightliftAll = Summator.getWeightliftAll();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Здравствуйте! Вас приветствует авиакомпания iamm3chanic.\n");
            while (flag) {
                System.out.println("\nЧто Вы желаете узнать?");
                System.out.println("1.Типы самолетов");
                System.out.println("2.Сортировка самолетов по дальности полета");
                System.out.println("3.Общая вместимость и грузоподъемность");
                System.out.println("4.Найти самолет по параметрам");
                System.out.println("5.Выход\n");
//                num = scanner.nextInt();
                try {
                    num = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка! Введите именно ЦИФРУ (не текст)."
                            + " Пожалуйста, будьте внимательней!");
                    scanner.next();
                    num = 0;
                }
                scanner.nextLine();
                switch (num) {
                    case 1:
                        System.out.println("1." + PlaneType.PASSENGER);
                        System.out.println("2." + PlaneType.FIGHTER);
                        System.out.println("3." + PlaneType.CARGO);
                        System.out.println("4." + PlaneType.BOMBER);
                        break;
                    case 2:
                        for (int i = 0; i < 19; i++) {
                            int t = i%5 + 1;
                            System.out.print(Database.commonArray[i].getType());
                            System.out.println(" " + t);
                            System.out.println(" пролетает " + Database.commonArray[i].getDistance() + " миль");
                        }
                        break;
                    case 3:
                        System.out.println("Общая вместимость и грузоподъемность нашей авиакомпании составляет: ");
                        System.out.println(volumeAll + " тонн " + weightliftAll + " кубических метров");
                        break;
                    case 4:
                        FinderByFuel.find(scanner);
                        break;
                    case 5:
                        System.out.println("До свидания!");
                        flag = false;
                        break;
                    default:
                        System.out.println("Введите цифру из предложенного диапазона");
                        break;
                }
            }
        }
    }
}

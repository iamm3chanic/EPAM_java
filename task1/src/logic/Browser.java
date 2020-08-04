package logic;

import domain.*;
import java.util.Scanner;
public class Browser {
    public void browse() {
        int num,flag=0;
        int volumeAll = Summator.getV();
        int weightliftAll = Summator.getW();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте! Вас приветствует авиакомпания iamm3chanic.\n");
        for (;flag==0;) {
            System.out.println("Что Вы желаете узнать?");
            System.out.println("1.Типы самолетов");
            System.out.println("2.Сортировка самолетов по дальности полета");
            System.out.println("3.Общая вместимость и грузоподъемность");
            System.out.println("4.Найти самолет по памаметрам");
            System.out.println("5.Выход\n");
        num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println(PlaneType.PASSENGER);
                    System.out.println(PlaneType.FIGHTER);
                    System.out.println(PlaneType.CARGO);
                    System.out.println(PlaneType.BOMBER);
                    System.out.println("\n");
                    break;
                case 2:
                    for(int i=0;i<19;i++) {
                        System.out.println(Database.commonArray[i].getType());
                        System.out.println(" пролетает " + Database.commonArray[i].getDistance() + " миль");
                    }
                    break;
                case 3:
                    System.out.println("Общая вместимость и грузоподъемность нашей авиакомпании составляет: ");
                    System.out.println(volumeAll + " тонн " + weightliftAll + " кубических метров");
                    break;
                case 4:
                    FinderByFuel.find();
                    break;
                case 5:
                    System.out.println("До свидания!");
                    flag = 1;
                    break;
                default:
                    System.out.println("Введите цифру из предложенного диапазона");
                    break;
            }
        }
        scanner.close();
    }
}

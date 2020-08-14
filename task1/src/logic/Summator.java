package logic;

import domain.Database;

public class Summator {
    static int volumeAll = 0;
    static int weightliftAll = 0;

    public static void count() {
        Database.setFighterArray();
        Database.setBomberArray();
        Database.setCargoArray();
        Database.setPassengerArray();
        for (int i = 0; i < 4; i++) {
            volumeAll += Database.bomberArray[i].getVolume();
            volumeAll += Database.fighterArray[i].getVolume();
            volumeAll += Database.cargoArray[i].getVolume();
            volumeAll += Database.passengerArray[i].getVolume();
            weightliftAll += Database.bomberArray[i].getWeightlift();
            weightliftAll += Database.fighterArray[i].getWeightlift();
            weightliftAll += Database.cargoArray[i].getWeightlift();
            weightliftAll += Database.passengerArray[i].getWeightlift();
        }
    }

    public static int getV() {
        return volumeAll;
    }

    public static int getW() {
        return weightliftAll;
    }
//суммируем весь волюм и вейтлифт по всем самолетам что есть в компании
}

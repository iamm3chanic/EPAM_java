package logic;
import domain.Database;
public class Sorting {

    public static void sort() {
        int i,j,t;
        Database.setFighterArray();
        Database.setBomberArray();
        Database.setCargoArray();
        Database.setPassengerArray();
        Database.setCommonArray();
        for (j = 0; j < 19; j++) {
            for (i = 0; i < 19; i++) {
                if(Database.commonArray[i].getDistance() > Database.commonArray[i+1].getDistance()) {
                    t = Database.commonArray[i].getDistance();
                    Database.commonArray[i].setDistance(Database.commonArray[i+1].getDistance());
                    Database.commonArray[i+1].setDistance(t);
                }
            }
        }
    }
}

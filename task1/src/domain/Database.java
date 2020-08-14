package domain;

public class Database {
    public static Plane[] fighterArray = new FighterPlane[10];
    public static Plane[] cargoArray = new CargoPlane[10];
    public static Plane[] passengerArray = new PassengerPlane[10];
    public static Plane[] bomberArray = new BomberPlane[10];
    public static Plane[] commonArray = new Plane[40];

    public static void setCommonArray() {
        Database.commonArray[0] = Database.passengerArray[0];
        Database.commonArray[1] = Database.passengerArray[1];
        Database.commonArray[2] = Database.passengerArray[2];
        Database.commonArray[3] = Database.passengerArray[3];
        Database.commonArray[4] = Database.passengerArray[4];
        Database.commonArray[5] = Database.fighterArray[0];
        Database.commonArray[6] = Database.fighterArray[1];
        Database.commonArray[7] = Database.fighterArray[2];
        Database.commonArray[8] = Database.fighterArray[3];
        Database.commonArray[9] = Database.fighterArray[4];
        Database.commonArray[10] = Database.bomberArray[0];
        Database.commonArray[11] = Database.bomberArray[1];
        Database.commonArray[12] = Database.bomberArray[2];
        Database.commonArray[13] = Database.bomberArray[3];
        Database.commonArray[14] = Database.bomberArray[4];
        Database.commonArray[15] = Database.cargoArray[0];
        Database.commonArray[16] = Database.cargoArray[1];
        Database.commonArray[17] = Database.cargoArray[2];
        Database.commonArray[18] = Database.cargoArray[3];
        Database.commonArray[19] = Database.cargoArray[4];
    }
    public static void setPassengerArray() {
        Database.passengerArray[0] = new PassengerPlane(PlaneType.PASSENGER, "fuel1", 70, 3500, 160, 2500);
        Database.passengerArray[1] = new PassengerPlane(PlaneType.PASSENGER, "fuel2", 70, 3600, 170, 3500);
        Database.passengerArray[2] = new PassengerPlane(PlaneType.PASSENGER, "fuel3", 80, 4500, 180, 2500);
        Database.passengerArray[3] = new PassengerPlane(PlaneType.PASSENGER, "fuel4", 60, 2500, 140, 2500);
        Database.passengerArray[4] = new PassengerPlane(PlaneType.PASSENGER, "fuel5", 70, 3500, 160, 2500);
    }

    public static void setBomberArray() {
        Database.bomberArray[0] = new BomberPlane(PlaneType.BOMBER, "fuel1", 20, 200, 12, 3000);
        Database.bomberArray[1] = new BomberPlane(PlaneType.BOMBER, "fuel2", 34,230, 11, 2000);
        Database.bomberArray[2] = new BomberPlane(PlaneType.BOMBER, "fuel3", 40,300, 11, 2000);
        Database.bomberArray[3] = new BomberPlane(PlaneType.BOMBER, "fuel4", 30,300, 15, 3000);
        Database.bomberArray[4] = new BomberPlane(PlaneType.BOMBER, "fuel5", 40,350, 16, 2500);
    }
    public static void setFighterArray() {
        Database.fighterArray[0] = new FighterPlane(PlaneType.FIGHTER, "fuel1", 20, 200, 12, 3000);
        Database.fighterArray[1] = new FighterPlane(PlaneType.FIGHTER, "fuel2", 34,230, 11, 2000);
        Database.fighterArray[2] = new FighterPlane(PlaneType.FIGHTER, "fuel3", 40,300, 11, 2000);
        Database.fighterArray[3] = new FighterPlane(PlaneType.FIGHTER, "fuel4", 30,300, 15, 3000);
        Database.fighterArray[4] = new FighterPlane(PlaneType.FIGHTER, "fuel5", 40,350, 16, 2500);
    }
    public static void setCargoArray() {
        Database.cargoArray[0] = new CargoPlane(PlaneType.CARGO, "fuel1", 70,3500, 160, 2500);
        Database.cargoArray[1] = new CargoPlane(PlaneType.CARGO, "fuel2", 70,4000, 160, 2500);
        Database.cargoArray[2] = new CargoPlane(PlaneType.CARGO, "fuel3", 80,3500, 167, 2700);
        Database.cargoArray[3] = new CargoPlane(PlaneType.CARGO, "fuel4", 85,4500, 170, 3000);
        Database.cargoArray[4] = new CargoPlane(PlaneType.CARGO, "fuel5", 70,3000, 150, 2500);
    }
}

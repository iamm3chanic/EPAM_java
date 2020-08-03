public class Database {
    public static Plane[] fighterArray = new Plane[10];
    static Plane[] cargoArray = new Plane[10];
    static Plane[] passengerArray = new Plane[10];
    static Plane[] bomberArray = new Plane[10];
    static Plane[] commonArray = new Plane[40];
    public static void setCommonArray(Plane[] commonArray) {
        Database.commonArray = commonArray;
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
    public static void setPassengerArray(Plane[] passengerArray) {
        Database.passengerArray = passengerArray;
        Database.passengerArray[0] = new Plane(PlaneType.PASSENGER, "fuel1", 70, 3500, 160, 2500) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.passengerArray[1] = new Plane(PlaneType.PASSENGER, "fuel2", 70, 3600, 170, 3500) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.passengerArray[2] = new Plane(PlaneType.PASSENGER, "fuel3", 80, 4500, 180, 2500) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.passengerArray[3] = new Plane(PlaneType.PASSENGER, "fuel4", 60, 2500, 140, 2500) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.passengerArray[4] = new Plane(PlaneType.PASSENGER, "fuel5", 70, 3500, 160, 2500) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
    }
    public static void setBomberArray(Plane[] bomberArray) {
        Database.bomberArray = bomberArray;
        Database.bomberArray[0] = new Plane(PlaneType.BOMBER, "fuel1", 20, 200, 12, 3000) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.bomberArray[1] = new Plane(PlaneType.BOMBER, "fuel2", 34,230, 11, 2000) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.bomberArray[2] = new Plane(PlaneType.BOMBER, "fuel3", 40,300, 11, 2000) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.bomberArray[3] = new Plane(PlaneType.BOMBER, "fuel4", 30,300, 15, 3000) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.bomberArray[4] = new Plane(PlaneType.BOMBER, "fuel5", 40,350, 16, 2500) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
    }
    public static void setFighterArray(Plane[] fighterArray) {
        Database.fighterArray = fighterArray;
        Database.fighterArray[0] = new Plane(PlaneType.FIGHTER, "fuel1", 20, 200, 12, 3000) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.fighterArray[1] = new Plane(PlaneType.FIGHTER, "fuel2", 34,230, 11, 2000) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.fighterArray[2] = new Plane(PlaneType.FIGHTER, "fuel3", 40,300, 11, 2000) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.fighterArray[3] = new Plane(PlaneType.FIGHTER, "fuel4", 30,300, 15, 3000) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.fighterArray[4] = new Plane(PlaneType.FIGHTER, "fuel5", 40,350, 16, 2500) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
    }
    public static void setCargoArray(Plane[] cargoArray) {
        Database.cargoArray = cargoArray;
        Database.cargoArray[0] = new Plane(PlaneType.CARGO, "fuel1", 70,3500, 160, 2500) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.cargoArray[1] = new Plane(PlaneType.CARGO, "fuel2", 70,4000, 160, 2500) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.cargoArray[2] = new Plane(PlaneType.CARGO, "fuel3", 80,3500, 167, 2700) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.cargoArray[3] = new Plane(PlaneType.CARGO, "fuel4", 85,4500, 170, 3000) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
        Database.cargoArray[4] = new Plane(PlaneType.CARGO, "fuel5", 70,3000, 150, 2500) {
            @Override
            public PlaneType getType() {
                return super.getType();
            }
        };
    }

    public static Plane[] getFighterArray() {
        return fighterArray;
    }
}

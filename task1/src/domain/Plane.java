public abstract class Plane {
    private PlaneType type;
    private String fuelType;
    private Integer fuelCount;
    private Integer volume;
    private Integer weightlift;
    private Integer distance;

    public Plane(PlaneType planeType, String fuelType, int fuelCount, int volume, int weightlift, int distance) {
    }

    public PlaneType getType() {
        return type;
    }
    public void setType(PlaneType type) {
        this.type = type;
    }

    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelCount() {
        return fuelCount;
    }
    public void setFuelCount(int fuelCount) {
        this.fuelCount = fuelCount;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getWeightlift() {
        return weightlift;
    }
    public void setWeightlift(int weightlift) {
        this.weightlift = weightlift;
    }

    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }

  
    @Override
    public String toString() {
        return "\nСамолет " + type.getName() + ":\nПотребляет топливо типа: " + fuelType + "\nРасход: " + fuelCount
                + "\nВместимость: " + volume + "\nГрузоподъемность: " + weightlift + "\nДальность полета: " + distance;
    }
}

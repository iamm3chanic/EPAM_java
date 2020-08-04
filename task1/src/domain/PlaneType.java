package domain;

public enum PlaneType {
    PASSENGER (1, "Пассажирский"),
    FIGHTER   (2, "Истребитель"),
    CARGO     (3, "Грузовой"),
    BOMBER    (4, "Бомбардировщик");

    private int index;
    private String name;
    PlaneType(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
}

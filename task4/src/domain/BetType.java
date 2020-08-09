package domain;

public enum BetType {
    WINS    (0, "betType.wins"),
    LOSES   (1, "betType.loses");

    private int index;
    private String name;

    BetType(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return Long.valueOf(ordinal());
    }
}

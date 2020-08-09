package domain;

public enum Status {
    LOSS    (0, "status.loss"),
    SUCCESS (1, "status.success");

    private int index;
    private String name;

    Status(int index, String name) {
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

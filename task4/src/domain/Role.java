package domain;

public enum Role {
    CLIENT    (0, "role.client"),
    BOOKMAKER (1, "role.bookmaker"),
    ADMIN     (2, "role.admin");
    private int index;
    private String name;

    Role(int index, String name) {
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

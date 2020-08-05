package domain;

public class Gun {
    private String identity;
    private String model;
    private String origin;
    private boolean handy;

    private Chars chars;

    public Gun() {}

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean getHandy() {
        return handy;
    }

    public void setHandy(boolean handy) {
        this.handy = handy;
    }

    public Chars getChars() {
        return chars;
    }

    public void setChars(Chars chars) {
        this.chars = chars;
    }

    @Override
    public String toString() {
        return "Gun:\nID = " + identity +"\nmodel = " + model + "\norigin = "
                + origin + "\nhandy = " + handy + "\n" + chars;
    }
}

package domain;

public class Chars {
    private String distance;
    private int onTarget;
    private boolean magazine;
    private boolean optics;
    private String material;

    public Chars() {}

    public Chars(String distance, int ontarget, boolean magazine,
                 boolean optics, String material) {
        this.distance = distance;
        this.onTarget = ontarget;
        this.magazine = magazine;
        this.optics = optics;
        this.material = material;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getOnTarget() {
        return onTarget;
    }

    public void setOnTarget(int onTarget) {
        this.onTarget = onTarget;
    }

    public boolean isMagazine() {
        return magazine;
    }

    public void setMagazine(boolean magazine) {
        this.magazine = magazine;
    }
    public boolean isOptics() {
        return optics;
    }

    public void setOptics(boolean optics) {
        this.optics = optics;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "CHARS:" + "\n\tdistance = " + distance + "\n\tdistance on target = " + onTarget
                + "\n\tmagazine = " + magazine + "\n\toptics = " + optics;
    }
}

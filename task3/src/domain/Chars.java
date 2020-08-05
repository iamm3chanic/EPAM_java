package domain;

public class Chars {
    private String distance;
    private int ontarget;
    private boolean magazine;
    private boolean optics;
    private String material;

    public Chars() {}

    public Chars(String distance, int ontarget, boolean magazine,
                 boolean optics, String material) {
        this.distance = distance;
        this.ontarget = ontarget;
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

    public int getOntarget() {
        return ontarget;
    }

    public void setOntarget(int ontarget) {
        this.ontarget = ontarget;
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
        return "CHARS:" + "\n\tdistance = " + distance + "\n\tdistance on target = " + ontarget
                + "\n\tmagazine = " + magazine + "\n\toptics = " + optics;
    }
}

package domain;

public class Bookmaker extends User{
    private Long raceId;

    public Long getRaceId() {
        return raceId;
    }

    public void setRaceId(Long raceId) {
        this.raceId = raceId;
    }
}

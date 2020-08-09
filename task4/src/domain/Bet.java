package domain;

public class Bet extends TableUnit {
    private Long clientId;
    private Long raceId;
    private BetType betType;
    private byte horse;
    private float coeff;
    private String description;
    private  Status status;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getRaceId() {
        return raceId;
    }

    public void setRaceId(Long raceId) {
        this.raceId = raceId;
    }

    public BetType getBetType() {
        return betType;
    }

    public void setBetType(BetType betType) {
        this.betType = betType;
    }

    public byte getHorse() {
        return horse;
    }

    public void setHorse(byte horse) {
        this.horse = horse;
    }

    public float getCoeff() {
        return coeff;
    }

    public void setCoeff(float coeff) {
        this.coeff = coeff;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
/*
    `bet_id`  INT NOT NULL AUTO_INCREMENT,
    `client_id`   INT NOT NULL,
    `race_id`    INT NOT NULL AUTO_INCREMENT,
    `bet_type`     TINYINT NOT NULL COMMENT '0 - horse wins, 1 - horse loses',
    `horse`    SMALLINT COMMENT 'number of horse',
    `coeff` FLOAT NOT NULL,
    `description` VARCHAR(255) NOT NULL,
    `status`      TINYINT COMMENT '0 - loss, 1 - success'*/
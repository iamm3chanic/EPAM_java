package domain;

import java.util.Date;
import java.text.*;
public class Race extends TableUnit {
    private byte horses;
    private Date date;
    private String place;

    public byte getHorses() {
        return horses;
    }
    public void setHorses(byte horses) {
        this.horses = horses;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
}
/*`race_id`    INT NOT NULL AUTO_INCREMENT,
    `horses`    SMALLINT COMMENT 'number of horses',
    `date`      DATE NOT NULL,
    `place`*/
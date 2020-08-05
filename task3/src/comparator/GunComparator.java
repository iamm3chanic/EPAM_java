package comparator;

import java.util.Comparator;
import domain.*;
public class GunComparator implements Comparator<Gun> {
    public int compare(Gun gun1, Gun gun2) {
        String gunModel1 = gun1.getModel();
        String gunModel2 = gun2.getModel();
        return gunModel1.compareToIgnoreCase(gunModel2);
    }
}

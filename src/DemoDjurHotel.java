import djur.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meron Lindkvist
 * Date:2020-09-28
 * Time:14:05
 * Project:IntelliJ IDEA
 * Copyright: MIT
 */

public class DemoDjurHotel implements DjurHotel{
    /**
     * katt,hund och orm ärvs från djur darför används djur i listan.
     * Dvs använder polymorfism
     */
    List<Djur> djurSomBorIHotellet = new ArrayList<>();

    public DemoDjurHotel() {
        djurSomBorIHotellet.add(new Hund("Sixten", 5.0));
        djurSomBorIHotellet.add(new Hund("Dogge", 10.0));
        djurSomBorIHotellet.add(new Katt("Venus", 5.0));
        djurSomBorIHotellet.add(new Katt("Ove", 3.0));
        djurSomBorIHotellet.add(new Orm("Hypno", 1.0));
    }

    public Djur hittaDjurMedNamn(String djurNamn) {
        for (Djur djur : djurSomBorIHotellet) {
            if (djur.getNamn().equalsIgnoreCase(djurNamn))
                return djur;
        }
        return null;
    }
}

package djur;

/**
 * Created by Meron Lindkvist
 * Date:2020-09-25
 * Time:16:05
 * Project:IntelliJ IDEA
 * Copyright: MIT
 */

abstract public class Djur {
    /**
     * inkapsling för att inte kunna ändra på namn och vikten ska kunna användas i subklassen.
     */
    private String namn;
    protected double vikt;


    public Djur(String namn, double vikt) {
        this.namn = namn;
        this.vikt = vikt;
    }

    /**
     * Enum används för att beskriva olika matsorter
     * @return
     */

    public abstract DjurFoder sortsMat();
    public abstract double getPortionStorlek();

    public String getNamn() {
        return namn;
    }

}

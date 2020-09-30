package djur;

/**
 * Created by Meron Lindkvist
 * Date:2020-09-25
 * Time:20:33
 * Project:IntelliJ IDEA
 * Copyright: MIT
 */

public class Orm extends Djur {

    public Orm(String namn, double vikt){
        super(namn, vikt);
    }

    @Override
    public DjurFoder sortsMat() {
        return DjurFoder.ORMPELLETS;
    }

    @Override
    public double getPortionStorlek(){
        return 20;
    }

}

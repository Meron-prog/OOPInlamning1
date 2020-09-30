package djur;

/**
 * Created by Meron Lindkvist
 * Date:2020-09-25
 * Time:20:33
 * Project:IntelliJ IDEA
 * Copyright: MIT
 */

public class Hund extends Djur {

    public Hund(String namn, double Vikt) {
        super(namn, Vikt);
    }

    @Override
    public DjurFoder sortsMat(){
        return DjurFoder.HUNDFODER;
    }

    @Override
    public double getPortionStorlek(){
        return vikt*1000/100;
    }

}




package djur;

/**
 * Created by Meron Lindkvist
 * Date:2020-09-25
 * Time:20:33
 * Project:IntelliJ IDEA
 * Copyright: MIT
 */

public class Katt extends Djur {

    public Katt(String namn, double vikt){
        super(namn,vikt);
    }

    @Override
    public DjurFoder sortsMat() {
        return DjurFoder.KATTFODER;
    }

    @Override
    public double getPortionStorlek(){
        return (vikt*1000/150);
    }

}

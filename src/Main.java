import djur.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meron Lindkvist
 * Date:2020-09-25
 * Time:21:29
 * Project:IntelliJ IDEA
 * Copyright: MIT
 */

public class Main {

    public static void main(String[] args) {
        /**
         * Interface Djurhotel, som implementeras av DemoDjurHotel och den beskriver vad klassen DemoDjurhotel kan göra.
         *
         */
        DjurHotel djurHotel = new DemoDjurHotel();

        String djurNamn = JOptionPane.showInputDialog("”Vilket djur ska få mat?”");
        Djur djur = djurHotel.hittaDjurMedNamn(djurNamn);
        if (djur != null) {
            JOptionPane.showMessageDialog(null,djurNamn + " ska matas med " + djur.getPortionStorlek() +"g " + djur.sortsMat());
        } else {
            JOptionPane.showMessageDialog(null,"OBS! Hittar inte djurets namn.");
        }

    }

}
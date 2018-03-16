package edication.Exec.dich;

import java.util.ArrayList;
import java.util.List;

public class Dich {
    public static List<Teeth> createTeeth(){
        List<Teeth> teethList = new ArrayList<>();
        teethList.add(new Teeth(7));
        teethList.add(new Teeth(1));
        teethList.add(new Teeth(4));
        teethList.add(new Teeth(7));
        teethList.add(new Teeth(6));
        teethList.add(new Teeth(3));
        teethList.add(new Teeth(4));

        return  teethList;
    }

    public static int goodTeeth(List<Teeth> teethList){
        int numOfGoodTeeth = 0;

        for (Teeth teeth: teethList) {
            if (teeth.checkSharp()){
                numOfGoodTeeth++;
            }
        }
        return numOfGoodTeeth;
    }

}

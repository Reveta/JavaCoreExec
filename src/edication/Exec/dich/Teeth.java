package edication.Exec.dich;

import com.sun.org.apache.bcel.internal.classfile.Constant;

public class Teeth {
    static int levelOfSharp = 4;
    private int sharp;

    public boolean checkSharp(){
        if (this.getSharp() >= 4){
            return true;
        }

        return false;
    }


    public int getSharp() {
        return sharp;
    }

    public void setSharp(int sharp) {
        this.sharp = sharp;
    }

    public Teeth(int sharp) {
        this.sharp = sharp;
    }

    @Override
    public String toString() {
        return "Teeth{" +
                "sharp=" + sharp +
                '}';
    }


}

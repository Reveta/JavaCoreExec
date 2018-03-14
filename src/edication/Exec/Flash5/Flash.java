package edication.Exec.Flash5;

public class Flash {
    private final static double lightSpeed = 299792458;
    private final static double VoiceSpeed = 343.1;

    private double time;

    public double distance(){
        double time = this.getTime() * VoiceSpeed;

        return time;
    }

    public Flash(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    private static double getLightSpeed() {
        return lightSpeed;
    }

    private static double getVoiceSpeed() {
        return VoiceSpeed;
    }
}

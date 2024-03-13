package autonomous;


import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;




public class hardware {
    public Servo scan;


    private HardwareMap hardwareMap;
    private Gear gear;

    public hardware(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;
        init();
    }

    public void init() {
        this.scan = (Servo) hardwareMap.servo.get("scan");
        reset();
    }

    public void reset() {
        scan.setPosition(0.5);
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public Gear getGear() {
        return this.gear;
    }
    public enum  Gear {
        FIRST(0.25), SECOND(0.5), THIRD(0.75), FOURTH(0.90);
        //FOURTH was 1.0


        private double MaxSpeed;

        Gear(double maxSpeed){
            this.MaxSpeed = maxSpeed;
        }

        public double getMaxSpeed() {
            return MaxSpeed;
        }
    }
    public Servo getScan(){return scan;}
}
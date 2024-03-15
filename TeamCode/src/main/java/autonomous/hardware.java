package autonomous;


import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cRangeSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;




public class hardware {
    public Servo scan, ledstrip;


    private HardwareMap hardwareMap;
    private Gear gear;

    public hardware(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;
        init();
    }

    public void init() {
        this.scan =  hardwareMap.servo.get("scan");
        this.ledstrip = hardwareMap.servo.get("ledstrip");

        reset();
    }

    public void reset() {
        scan.setPosition(0.5);
        ledstrip.setPosition(0.74);
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
    public Servo getLedstrip(){return ledstrip;}
}
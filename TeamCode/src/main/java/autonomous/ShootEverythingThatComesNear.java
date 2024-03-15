package autonomous;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cRangeSensor;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp(name="Biem!", group="Warning")
public class ShootEverythingThatComesNear extends LinearOpMode {
    ModernRoboticsI2cRangeSensor rangeSensor;
    private hardware Hardware;
    private int i = 1;
    private double green = 0.5;
    private double blue = 0.74;
    private double red = 0.67;

    @Override public void runOpMode() {
        rangeSensor = hardwareMap.get(ModernRoboticsI2cRangeSensor.class, "sensor_range");
        this.Hardware = new hardware(hardwareMap);

        waitForStart();

            while (opModeIsActive()) {
               /* while(true){
                    Hardware.scan.setPosition(1);
                    sleep(1000);
                    Hardware.scan.setPosition(0.75);
                    sleep(1000);
                    Hardware.scan.setPosition(0.5);
                    sleep(1000);
                    Hardware.scan.setPosition(0.25);
                    sleep(1000);
                    Hardware.scan.setPosition(0.5);
                    sleep(1000);
                    Hardware.scan.setPosition(0.75);
                    sleep(1000);

              */while  (rangeSensor.rawUltrasonic()>10) {
                    Hardware.scan.setPosition(1);
                    sleep(1000);
                    Hardware.scan.setPosition(0.75);
                    sleep(1000);
                    Hardware.scan.setPosition(0.5);
                    sleep(1000);
                    Hardware.scan.setPosition(0.25);
                    sleep(1000);
                    Hardware.scan.setPosition(0.5);
                    sleep(1000);
                    Hardware.scan.setPosition(0.75);
                    sleep(1000);
                }
                if (rangeSensor.rawUltrasonic()<10) {
                    Hardware.ledstrip.setPosition(red);
                }
                else if (rangeSensor.rawUltrasonic()>10) {
                    Hardware.ledstrip.setPosition(green);
                }
                else {
                    Hardware.ledstrip.setPosition(blue);
                }
                telemetry.addData("ultrasonic", rangeSensor.rawUltrasonic());
                telemetry.addData("optical", rangeSensor.rawOptical());
                telemetry.update();
            }
        }}
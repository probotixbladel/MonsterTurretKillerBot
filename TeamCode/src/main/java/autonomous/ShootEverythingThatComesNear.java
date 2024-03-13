package autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="Biem!", group="Warning")
public class ShootEverythingThatComesNear extends LinearOpMode {
    private hardware Hardware;

    public void runOpMode() throws InterruptedException {
        while (!isStarted() && !isStopRequested()){
        this.Hardware = new hardware(hardwareMap);
    }
        waitForStart();
        if (!isStopRequested()) {
            if(Hardware.afstand >50) {
                Hardware.scan.setPosition(1);
                sleep(100);
                Hardware.scan.setPosition(0);
            }
            else{
                ledstrip.turnOn
            }

        }}}
package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.ColorSensor;


public class HardwareConfig {
    /* Public OpMode members. */
    public DcMotor frontRight = null;
    public DcMotor frontLeft = null;
    public DcMotor backRight = null;
    public DcMotor backLeft = null;
    public DcMotor rackpinion = null;
    public Servo upleftClaw = null;
    public Servo uprightClaw = null;
    public Servo bottomleftClaw = null;
    public Servo bottomrightClaw = null;
    public static final double MID_SERVO = 0.5;
    public Servo jewelhitter = null;
    public ColorSensor colorSensor;


    /* local OpMode members. */
    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    /* Constructor */
    public HardwareConfig() {

    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        frontRight = hwMap.get(DcMotor.class, "fr_motor");
        frontLeft = hwMap.get(DcMotor.class, "fl_motor");
        backRight = hwMap.get(DcMotor.class, "br_motor");
        backLeft = hwMap.get(DcMotor.class, "bl_motor");
        rackpinion = hwMap.get(DcMotor.class, "platform");
        colorSensor = hwMap.colorSensor.get("color");


        upleftClaw = hwMap.get(Servo.class, "upleft_hand");
        uprightClaw = hwMap.get(Servo.class, "upright_hand");
        jewelhitter = hwMap.get(Servo.class, "jeweler");


        frontLeft.setDirection(DcMotor.Direction.REVERSE); // Set to REVERSE if using AndyMark motors
        backLeft.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
        frontRight.setDirection(DcMotor.Direction.REVERSE); // Set to REVERSE if using AndyMark motors
        backRight.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
        rackpinion.setDirection(DcMotor.Direction.REVERSE);


        // Set all motors to zero power
        frontRight.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        backLeft.setPower(0);
        rackpinion.setPower(0);


        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rackpinion.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


    }
}

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

@TeleOp(name = "WestCoastDrive", group = "TeleOp")
public class WestCoastDrive extends LinearOpMode{
    private DcMotor motorFR;
    private DcMotor motorFL;
    private DcMotor motorRR;
    private DcMotor motorRL;

    /* Declare OpMode members. */
    HardwareConfig robot           = new HardwareConfig();   // Use a Pushbot's hardware
    // could also use HardwarePushbotMatrix class.

    @Override
    public void runOpMode () throws InterruptedException
    {

        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Say", "Shock drone going live!");    //
        telemetry.update();

        waitForStart();

        telemetry.addData("Say", "ASSUMING DIRECT CONTROL");    //
        telemetry.update();
        while(opModeIsActive())
        {
            motorFR.setPower(-gamepad1.right_stick_y);
            motorFL.setPower(-gamepad1.left_stick_y);
            motorRR.setPower(-gamepad1.right_stick_y);
            motorRL.setPower(-gamepad1.left_stick_y);

            idle();
        }
    }
}


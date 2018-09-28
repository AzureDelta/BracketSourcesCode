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

    @Override
    public void runOpMode () throws InterruptedException
    {
        motorFR = hardwareMap.dcMotor.get("motorFR");
        motorFL = hardwareMap.dcMotor.get("motorFR");
        motorRR = hardwareMap.dcMotor.get("motorFR");
        motorRL = hardwareMap.dcMotor.get("motorFR");

        motorFR.setDirection(DcMotor.Direction.REVERSE);
        motorRR.setDirection(DcMotor.Direction.REVERSE);

        System.out.println("Stay here and stay alert!");

        waitForStart();

        System.out.println("Shock drone going live.");

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


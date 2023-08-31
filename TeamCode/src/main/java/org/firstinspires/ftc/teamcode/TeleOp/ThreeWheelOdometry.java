package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.TouchSensor;


    @TeleOp(name="ThreeWheelOdometry", group="Iterative OpMode")
    public class ThreeWheelOdometry extends OpMode {

        // declarations

        // 4 wheels
        private DcMotor leftFront;
        private DcMotor leftBack;
        private DcMotor rightFront;
        private DcMotor rightBack;

        private double pow; // power for motors

        double[] pose = {0, 0, 0}; // pose is the current orientation of the robot.
                                   // index 0 is the x coordinate on the field from the origin
                                   // index 1 index is the y coordinate on the field from the origin
                                   // index 2 is the angle of the robot from 0 degrees (think unit circle)
                                   // coordinates of center of the robot

        @Override
        public void init() {
            // init commands

            // 4 wheels
            leftFront = hardwareMap.get(DcMotor.class, "leftFront");
            leftBack = hardwareMap.get(DcMotor.class, "leftBack");
            rightFront = hardwareMap.get(DcMotor.class, "rightFront");
            rightBack = hardwareMap.get(DcMotor.class, "rightBack");
        }

        @Override
        public void loop() {
            // what's happening in the program
        }

        @Override
        public void stop() {
            // end of code, automatically run by robot
        }
    }

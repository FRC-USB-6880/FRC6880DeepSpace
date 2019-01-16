package frc.robot.driveSystems;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class TalonSRX2spdDriveSystem implements DriveSystem {
    Robot robot;
    Encoder leftEncoder;
    Encoder rightEncoder;
    DifferentialDrive drive;
    SpeedControllerGroup leftMotor;
    SpeedControllerGroup rightMotor;
    boolean isMoving;
    double multiplier;

    public TalonSRX2spdDriveSystem (){
        drive = new DifferentialDrive(leftMotor, rightMotor);
    }

    public void tankDrive(double leftSpeed, double rightSpeed){
        drive.tankDrive(multiplier*leftSpeed, multiplier*rightSpeed);
    }

    public void arcadeDrive(double speed, double direction){
        drive.arcadeDrive(multiplier*speed, direction);
    }

    public void resetEncoders(){
        leftEncoder.reset();
        rightEncoder.reset();
    }

    public double getEncoderDist(){
        return (leftEncoder.getDistance()+rightEncoder.getDistance());
    }

    public void setLowSpeed(){
        
    }
    public void setHiSpeed(){

    }
    public boolean isMoving(){
        return isMoving;
    }
    public Gears getCurGear(){
        return curGear;
    }
    public void changeMultiplier(double multiplier){
        this.multiplier = multiplier;
    }
}
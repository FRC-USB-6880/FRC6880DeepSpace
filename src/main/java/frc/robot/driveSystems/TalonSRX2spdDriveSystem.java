package frc.robot.driveSystems;

import frc.robot.Robot;
import frc.robot.jsonReaders.DriveSysReader;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class TalonSRX2spdDriveSystem implements DriveSystem {
    Robot robot;
    Encoder leftEncoder;
    Encoder rightEncoder;
    DifferentialDrive drive;
    SpeedControllerGroup leftMotors;
    SpeedControllerGroup rightMotors;
    boolean isMoving;
    double multiplier;
    private Gears curGear;
    DriveSysReader jsonReader;


    public TalonSRX2spdDriveSystem (){
        jsonReader = new DriveSysReader("TalonSRX2spdDriveSystem");
        
        drive = new DifferentialDrive(leftMotors, rightMotors);
        curGear = Gears.LOW;
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

    public double getLeftEncoderDist(){
        return leftEncoder.getDistance();
    }

    public double getRightEncoderDist(){
        return rightEncoder.getDistance();
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
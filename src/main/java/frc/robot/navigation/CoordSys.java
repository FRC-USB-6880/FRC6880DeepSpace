package frc.robot.navigation;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.Encoder;

public class CoordSys {
    Robot robot;
    double[] pos = new double[3];
    double[] prevPos = new double[3];
    
    public CoordSys(double x, double y, double angle) {
        prevPos[0] = pos[0] = x;
        prevPos[1] = pos[1] = y;
        prevPos[2] = pos[2] = angle;
    }
    
    
}
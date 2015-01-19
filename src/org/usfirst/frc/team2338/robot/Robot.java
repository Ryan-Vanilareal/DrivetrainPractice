package org.usfirst.frc.team2338.robot;

import org.usfirst.frc.team2338.robot.subsystems.Drivetrainsub;

import edu.wpi.first.wpilibj.IterativeRobot;

import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {
public static final Drivetrainsub drivetrain = new Drivetrainsub();
public static OI oi;

/**
* This function is run when the robot is first started up and should be
* used for any initialization code.
*/
public void robotInit() {
oi = new OI();
// instantiate the command used for the autonomous period

}
public void disabledPeriodic() {
Scheduler.getInstance().run();
}

// schedule the autonomous command (example)

/**
* This function is called periodically during autonomous
*/
public void autonomousInit() {
	
}

public void autonomousPeriodic() {
	Scheduler.getInstance().run();
}

public void teleopInit() {
// This makes sure that the autonomous stops running when
// teleop starts running. If you want the autonomous to
// continue until interrupted by another command, remove
// this line or comment it out.

}
/**
* This function is called when the disabled button is hit.
* You can use it to reset subsystems before shutting down.
*/
public void disabledInit(){
}
/**
* This function is called periodically during operator control
*/
public void teleopPeriodic() {
Scheduler.getInstance().run();
}
/**
* This function is called periodically during test mode
*/
public void testPeriodic() {
LiveWindow.run();
}
}

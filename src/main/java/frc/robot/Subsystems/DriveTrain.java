/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private VictorSPX FrontLeftMotor = new VictorSPX(RobotMap.kMotorFrontLeftID);
  private VictorSPX BackLeftMotor = new VictorSPX(RobotMap.kMotorBackLeftID);
  private VictorSPX FrontRightMotor = new VictorSPX(RobotMap.kMotorFrontRightID);
  private VictorSPX BackRightMotor = new VictorSPX(RobotMap.kMotorBackRightID);

  public void SetLeftMotorSpeed(double speed) {
    FrontLeftMotor.set(ControlMode.PercentOutput, speed);
    BackLeftMotor.set(ControlMode.PercentOutput, speed);
  }

  public void SetRightMotorSpeed(double speed) {
    FrontRightMotor.set(ControlMode.PercentOutput, -speed);
    BackRightMotor.set(ControlMode.PercentOutput, -speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

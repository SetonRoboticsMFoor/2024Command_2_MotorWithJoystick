// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.MotorSubsystem;
import edu.wpi.first.wpilibj2.command.Command;


public class SpinButtonMotorCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final MotorSubsystem m_subsystem;
  private double speed;

 
  public SpinButtonMotorCommand(MotorSubsystem subsystem, double speed) {
    m_subsystem = subsystem;
    this.speed = speed;
   
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {}

  
  @Override
  public void execute() {
    m_subsystem.spinButtonMotor(speed);
  }

  
  @Override
  public void end(boolean interrupted) {
    m_subsystem.stopButtonMotor();
  }

 
  @Override
  public boolean isFinished() {
    return false;
  }
}

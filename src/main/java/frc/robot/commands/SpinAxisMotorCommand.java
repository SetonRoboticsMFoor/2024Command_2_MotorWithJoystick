// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.MotorSubsystem;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;


public class SpinAxisMotorCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final MotorSubsystem m_subsystem;
  private final Supplier <Double> speedFunction;

 
  public SpinAxisMotorCommand(MotorSubsystem subsystem, Supplier<Double> speedFunction) {
    m_subsystem = subsystem;
    this.speedFunction = speedFunction;
   
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {}

  
  @Override
  public void execute() {
    double currentSpeed = speedFunction.get()*.25;
    if (currentSpeed > -.1 && currentSpeed < .1) {
      currentSpeed = 0;
    }
    m_subsystem.spinAxisMotor(currentSpeed);
  }

  
  @Override
  public void end(boolean interrupted) {
  m_subsystem.stopAxisMotor();
  }

 
  @Override
  public boolean isFinished() {
    return false;
  }
}

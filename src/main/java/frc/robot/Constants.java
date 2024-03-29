// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int DRIVER_CONTROLLER_PORT = 0;
    public static final int FWD_BUTTON_PORT = 1;
    public static final int REV_BUTTON_PORT = 2;
    public static final int DRIVE_AXIS = 1;
  }

  public static class Speeds {
    public static final double FWD_DRIVE_SPEED = .25;
    public static final double REV_DRIVE_SPEED = -.25;
    public static final double STOP_SPEED = 0.0;
  }

  public static class MotorConstants {
    public static final int BUTTON_MOTOR_PORT = 2;
    public static final int AXIS_MOTOR_PORT =7;
  }
}

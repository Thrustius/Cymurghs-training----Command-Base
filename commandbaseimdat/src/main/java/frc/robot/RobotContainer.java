/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;



import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.*;




public class RobotContainer
{

 Joystick Stick = new Joystick(1);
 JoystickButton motorButton = new JoystickButton(Stick, 1);
 JoystickButton solenoidButton = new JoystickButton(Stick, 2);

private final MotorCommand motorCommand = new MotorCommand();
  private final SolenoidCommand solenoidCommand = new SolenoidCommand();
  private final AutoCommand autonomousCommand = new AutoCommand();

   

   public RobotContainer()
{
  configureButtonBindings();
}


    private void configureButtonBindings(){
 motorButton.whileActiveContinuous(motorCommand);
 solenoidButton.whileActiveContinuous(solenoidCommand);
    }



    public Command getAutonomousCommand()
    {
    return autonomousCommand;
    }
}
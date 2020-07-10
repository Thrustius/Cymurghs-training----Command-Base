/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SolenoidSubsystem;

public class SolenoidCommand extends CommandBase {
    public SolenoidSubsystem m_solenoid = SolenoidSubsystem.getInstance();

    public SolenoidCommand() {
   addRequirements(this.m_solenoid);
    }


    @Override
    public void initialize() {
   m_solenoid.solenoidActivation(true);
    }

    @Override
    public void execute() {
    }


    @Override
    public boolean isFinished() {
   return false;
    }

    @Override
    public  void end(final boolean interrupted) {
   m_solenoid.solenoidActivation(false);
    }

}
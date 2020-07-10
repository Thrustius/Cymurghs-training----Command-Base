package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.MotorSubsystem;



public class MotorCommand extends CommandBase{

    public MotorSubsystem m_motor = MotorSubsystem.getInstance();

    public MotorCommand()
    {
        addRequirements(this.m_motor);
    }


    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
     m_motor.motorActivation(1.0);
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void end(boolean interrupted) {
        m_motor.motorActivation(0);

    }

}
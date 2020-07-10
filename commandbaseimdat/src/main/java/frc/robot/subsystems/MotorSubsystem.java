/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PWMVictorSPX;


public class MotorSubsystem extends SubsystemBase{

    private final static PWMVictorSPX m_motor = new PWMVictorSPX(0);
    private static MotorSubsystem INSTANCE;
    public static MotorSubsystem getInstance() {


  if (INSTANCE == null){ synchronized (MotorSubsystem.class){
  if (INSTANCE == null){
  INSTANCE = new MotorSubsystem();
  }
  }
  }
  return INSTANCE;
  }
    public MotorSubsystem(){}

    public void motorActivation(double speed){
   m_motor.set(speed);
    }

    @Override
    public void periodic(){}

}
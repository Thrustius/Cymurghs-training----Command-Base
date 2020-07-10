package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Solenoid;



public class SolenoidSubsystem extends SubsystemBase {
private final static Solenoid m_Solenoid = new Solenoid(0);

private static SolenoidSubsystem INSTANCE;
public static SolenoidSubsystem getInstance() {
 if (INSTANCE == null){
 synchronized (SolenoidSubsystem.class){
 if (INSTANCE == null){
 INSTANCE = new SolenoidSubsystem();

}
}
}   return INSTANCE;
}

    public SolenoidSubsystem() {}
    public void solenoidActivation(boolean status){
    m_Solenoid.set(status);
    }


    @Override
    public void periodic()
    {

    }
}
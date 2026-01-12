package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class IntakeFeedCommand extends Command {
    private final IntakeSubsystem m_intakeSubsystem;
    private final boolean m_inverted;

    /*
     * Design Question: Do we turn the feed motor while we intake?
     */
    public IntakeFeedCommand(IntakeSubsystem intakeSubsystem, boolean inverted) {
        m_intakeSubsystem = intakeSubsystem;
        m_inverted = inverted;
        addRequirements(intakeSubsystem);
    }
    
    @Override
    public void initialize() {}
    
    @Override
    public void execute() {
        if (m_inverted) {
            m_intakeSubsystem.setIntakeWheel(Constants.IntakeConstants.kWheelSpeed);
        } else {
            m_intakeSubsystem.setIntakeWheel(-Constants.IntakeConstants.kWheelSpeed);
        }
    }
    
    @Override
    public void end(boolean interrupted) {
        m_intakeSubsystem.setIntakeWheel(0.0);
    }
    
    @Override
    public boolean isFinished() {
        return false;
    }
}
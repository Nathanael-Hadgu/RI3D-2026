package frc.robot;

import static edu.wpi.first.units.Units.Amps;

import edu.wpi.first.units.measure.Current;

public class Constants {
    public static final int kDriverControllerPort = 0;

    public static final class DrivetrainConstants {
        public static final int kLeftLeaderPort = 2;
        public static final int kLeftFollowerPort = 3;
        public static final int kRightLeaderPort = 4;
        public static final int kRightFollowerPort = 5;
        public static final double kStickDeadband = 0.1;
    }

    public static final class IntakeConstants {
        // Port Constants
        public static final int kIntakeRotationLeaderPort = 0;
        public static final int kIntakeRotationFollowerPort = 0;
        public static final int kIntakeWheelPort = 0;
        public static final int kIntakeRotationEncoderChannelA = 0;
        public static final int kIntakeRotationEncoderChannelB = 0;

        // Motor Configuration Constants
        public static final Current kSupplyCurrentLimit = Amps.of(60);
        public static final Current kIntakeRotationStatorCurrentLimit = Amps.of(120);
        public static final Current kIntakeRotationWheelStatorCurrentLimit = Amps.of(120);

        // Encoder Positions
        public static final int kEncoderHomePosition = 0;
        public static final int kEncoderOutPosition = 0;

        // Speed Constants
        public static final double kRotationSpeed = 0.1;
        public static final double kWheelSpeed = 0.1;
    }
}
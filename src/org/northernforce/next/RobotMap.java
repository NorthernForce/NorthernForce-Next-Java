package org.northernforce.next;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring; makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around. All global variables should be stored here.
 */
public class RobotMap 
{
	/**
	 * The addresses of the CAN Jaguars on the CAN bus.
	 */
	public static final int kFrontLeftJaguar = 2;
	public static final int kFrontRightJaguar = 4;
	public static final int kRearLeftJaguar = 3;
	public static final int kRearRightJaguar = 5;

	 /*
	  * The button ports on the XBox Joystick; as interpreted by the cRIO.
	  */
	public static final int kXBoxButtonA = 1;
	public static final int kXBoxButtonB  = 2;
	public static final int kXBoxButtonX = 3;
	public static final int kXBoxButtonY = 4;
	public static final int kXBoxButtonLeft = 5;
	public static final int kXBoxButtonRight = 6;
	public static final int kXBoxButtonBack = 7;
	public static final int kXBoxButtonStart = 8;
	public static final int kXBoxButtonLeftJoystick = 9;
	public static final int kXBoxButtonRightJoystick = 10;

	/**
	 *  The port numbers of the analog sticks on the XBox Joystick.
	 */
	public static final int kLeftStickX = 1;
	public static final int kLeftStickY = 2;
	public static final int kRightStickX = 3;
	public static final int kRightStickY = 4;
	public static final int kTriggers = 5;


	/**
	 *  The different possible drive modes that the robot can use.
	 */
	public static final int kMecanumDrive = 1;
	public static final int kBSBotDrive = 2;
	public static final int kSkidSteer = 3;
	public static final int kSwivelSteer = 4;

	/**
	 *  The different possible levels of debug logging.
	 */
	public static final int kSystemLog = 1;
	public static final int kDebugLog = 2;
	public static final int kReleaseLog = 3;
	public static final int kErrorLog = 4;

	//Variables that concern driving the robot.
	public static final double kDriveP = 0.0;
	public static final double kDriveI = 0.0;
	public static final double kDriveD = 0.0;
	public static final int kDriveOutputVoltageLimit = 12;
	public static final int kDriveEncoderLines = 256;
	public static final Boolean kUseEncoders = false;
	public static final double kDriveRamp = 0.4;
	public static final double kDriveVelocityLimit = 1.0;

}

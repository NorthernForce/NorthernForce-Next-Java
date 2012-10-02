package org.northernforce.next.utils;

import org.northernforce.next.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the driver for the XBox Joystick
 * that we use at competition to control the robot.
 * All of the values returned by this class are 
 * already adjusted for the deadband in the controller itself.
 * 
 * This class also contains JoystickButtons for all of the 
 * buttons that are available on the XBox joystick itself. 
 * These buttons can be assigned by calling [stick].[button].WhenPressed().
 * 
 * @author arthurlockman
 */
public class FRCXboxJoystick extends Joystick
{
	public JoystickButton A;
	public JoystickButton B;
	public JoystickButton X;
	public JoystickButton Y;
	public JoystickButton Back;
	public JoystickButton Start;
	public JoystickButton LeftBumper;
	public JoystickButton RightBumper;
	
	private double deadband = 0.0;
	
	/**
	 * The constructor for the FRC XBox Joystick object.
	 * @param port The port to create the joystick on.
	 */
	public FRCXboxJoystick(int port)
	{
		super(port);
		
		A = new JoystickButton(this, RobotMap.kXBoxButtonA);
		B = new JoystickButton(this, RobotMap.kXBoxButtonB);
		X = new JoystickButton(this, RobotMap.kXBoxButtonX);
		Y = new JoystickButton(this, RobotMap.kXBoxButtonY);
		Back = new JoystickButton(this, RobotMap.kXBoxButtonBack);
		Start = new JoystickButton(this, RobotMap.kXBoxButtonStart);
		LeftBumper = new JoystickButton(this, RobotMap.kXBoxButtonLeft);
		RightBumper = new JoystickButton(this, RobotMap.kXBoxButtonRight);
		
		this.calculateDeadband();
	}
	
	/**
	 * Calculate the deadband on the controller.
	 */
	private void calculateDeadband()
	{
		deadband = 0.01;
	}
	
	/**
	 * Calculates the value that the controller
	 * should be returning based on the calculated
	 * deadband value.
	 * 
	 * @param val The value to apply the deadband 
	 * calculations to.
	 * 
	 * @return A double, the calculated value.
	 */
	private double deadbandAdjust(double val)
	{
		if (val > deadband) {
			return (val - deadband) / (1 - deadband);
		} else if (val < -deadband) {
			return (val + deadband) / (1 - deadband);
		} else {
			return 0;
		}
	}
	
	/**
	 * gets the Y of the left stick on the controller.
	 * @return the value of the Y axis, adjusted for the controller deadband.
	 */
	public double getLeftStickY()
	{
		return this.deadbandAdjust(this.getRawAxis(2));
	}

	/**
	 *  gets the X of the left stick on the controller.
	 * @return the value of the X axis, adjusted for the controller deadband.
	 */
	public double getLeftStickX()
	{
		return this.deadbandAdjust(this.getRawAxis(1));
	}

	/**
	 * gets the Y of the right stick on the controller.
	 * @return the value of the Y axis, adjusted for the controller deadband.
	 */
	public double getRightStickY()
	{
		return this.deadbandAdjust(this.getRawAxis(5));
	}

	/**
	 * gets the X of the right stick on the controller.
	 * @return the value of the Y axis, adjusted for the controller deadband.
	 */
	public double getRightStickX()
	{
		return this.deadbandAdjust(this.getRawAxis(4));
	}

	/**
	 * gets the value of the trigger on the controller. 
	 * This value accounts for both triggers, so use it wisely.
	 * @return The value of the trigger, not adjusted for the deadband.
	 */
	public double getStickTrigger()
	{
		return this.getRawAxis(3);
	}
	
	/**
	 * @brief Returns the same as A.get(), but is here for convenience.
	 * @return The button state.
	 */
	public Boolean getAButton()
	{
		return A.get();
	}

	/**
	 * @brief Returns the same as B.get(), but is here for convenience.
	 * @return The button state.
	 */
	public Boolean getBButton()
	{
		return B.get();
	}

	/**
	 * @brief Returns the same as X.get(), but is here for convenience.
	 * @return The button state.
	 */
	public Boolean getXButton()
	{
		return X.get();
	}

	/**
	 * @brief Returns the same as Y.get(), but is here for convenience.
	 * @return The button state.
	 */
	public Boolean getYButton()
	{
		return Y.get();
	}

	/**
	 * @brief Returns the same as Start.get(), but is here for convenience.
	 * @return The button state.
	 */
	public Boolean getStartButton()
	{
		return Start.get();
	}

	/**
	 * @brief Returns the same as Back.get(), but is here for convenience.
	 * @return The button state.
	 */
	public Boolean getBackButton()
	{
		return Back.get();
	}

	/**
	 * @brief Returns the same as LeftBumper.get(), but is here for convenience.
	 * @return The button state.
	 */
	public Boolean getLeftBumper()
	{
		return LeftBumper.get();
	}

	/**
	 * @brief Returns the same as RightBumper.get(), but is here for convenience.
	 * @return The button state.
	 */
	public Boolean getRightBumper()
	{
		return RightBumper.get();
	}
}

package org.northernforce.next.utils;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 * @author arthurlockman
 *
 */
public class RampedCANJaguar extends CANJaguar
{
    private static double deltaT = 0.02;
    double _maxAcceleration;
    double _maxVelocity;
    double _tolerance;
    double _thereTolerance;
    double _prevTime;
    double _prevPosition;
    double _prevVelocity;
    double _prevAccel;
    double _ramp;
    
    /**
     * Constructs a new instance of a RampedCANJaguar.
     * 
     * @param deviceNumber The device number of the Jaguar. Avoid using 1.
     * @param ramp 
     * @param maxVelocity
     * @param maxAcceleration
     * @param tolerance
     * @param thereTolerance
     * @throws CANTimeoutException
     */
	public RampedCANJaguar (int deviceNumber, double ramp, double maxVelocity, 
			double maxAcceleration, double tolerance, double thereTolerance) throws CANTimeoutException
	{
		super(deviceNumber);
	    _maxAcceleration = maxAcceleration;
	    _maxVelocity = ramp;
	    _tolerance = tolerance;
	    _thereTolerance = thereTolerance;
	    _prevTime = 0.0;
	    _prevPosition = 0.0;
	    _prevVelocity = 0.0;
	    _prevAccel = 0.0;
	    _ramp = ramp;
	}
	
	/**
	 * Prints the velocity and acceleration limit of the Jaguar.
	 */
	public void printLimits ()
	{
		System.out.println("Max Velocity: "+_maxVelocity+"\nMax Acceleration: "+_maxAcceleration);
	}
}

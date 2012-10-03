package org.northernforce.next.utils;

/**
 * A class for holding a 2D vector value.
 * @author arthurlockman
 */
public class Vector2D
{
	private double x, y;
	
	/**
	 * Constructs a new 2D vector object.
	 * @param xInit The initial value for the X component of the vector.
	 * @param yInit The initial value for the Y component of the vector.
	 */
	public Vector2D(double xInit, double yInit)
	{
		x = xInit;
		y = yInit;
	}
	
	/**
	 * Get the magnitude of the vector.
	 * @return A double, the magnitude of the vector.
	 */
	public double getMagnitude()
	{
		return Math.sqrt(x*x + y*y);
	}
}

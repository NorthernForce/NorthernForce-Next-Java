package org.northernforce.next.utils;

/**
 * A class for storing a 3D vector object.
 * @author arthurlockman
 */
public class Vector3D
{
	private double x, y, z;
	
	/**
	 * Constructs a 3D vector object.
	 * @param xInit The initial value for the X component of the vector.
	 * @param yInit The initial value for the Y component of the vector.
	 * @param zInit The initial value for the Z component of the vector.
	 */
	public Vector3D(double xInit, double yInit, double zInit)
	{
		x = xInit;
		y = yInit;
		z = zInit;
	}
	
	/**
	 * Gets the magnitude of the vector.
	 * @return A double, the vector's magnitude.
	 */
	public double getMagnitude()
	{
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	/**
	 * Returns the dot product of the two vectors
	 * @see http://en.wikipedia.org/wiki/Dot_product
	 * @param v The vector to perform the dot product operation with.
	 * @return A double, the dot product of the two vectors.
	 */
	public double dotProduct(Vector3D v)
	{
		return (x * v.x + y * v.y + z * v.z);
	}
	
	/**
	 * Returns the cross product of the two vectors
	 * @see http://en.wikipedia.org/wiki/Cross_product
	 * @param v The vector to perform the cross product operation with.
	 * @return A Vector3D, the cross product of the two vectors.
	 */
	public Vector3D crossProduct(Vector3D v)
	{
		return new Vector3D (y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
	}
	
	/**
	 * Subtracts a Vector3D from this Vector and returns the result
	 * as a new Vector3D object. The Vector passed in as a parameter
	 * will be subtracted from the one having the .subtract method 
	 * performed on it.
	 * @param rhs The vector to subtract.
	 * @return A Vector3D, the resultant of the subtraction operation.
	 */
	public Vector3D subtract(Vector3D rhs)
	{
		return new Vector3D (this.x - rhs.x, this.y - rhs.y, this.z - rhs.z);
	}
}

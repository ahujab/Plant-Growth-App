
package edu.neu.csye6200.fluid;

/**
 * A Rule defines how to generate a new FluidFrame from an existing one
 * @author barkha
 *
 */
public interface RuleI {

	public FluidFrame createNextFrame(FluidFrame inFrame);
	public int createNextCell(int inVal);
	
}

/**
 * 
 */
package edu.neu.csye6200.fluid;

/**
 * @author barkha
 *
 */
public class RuleA implements RuleI {

	/**
	 * 
	 */
	public RuleA() {
	}

	/* (non-Javadoc)
	 * @see edu.neu.csye6200.fluid.RuleI#createNextFrame(edu.neu.csye6200.fluid.FluidFrame)
	 */
	@Override
	public FluidFrame createNextFrame(FluidFrame inFrame) {
		FluidFrame nxtFrame = new FluidFrame(inFrame.getSize());
		
		for (int x = 0; x < inFrame.getSize(); x++) {
			for (int y = 0; y < inFrame.getSize(); y++) {
				int inboundVal = inFrame.getCellInValue(x, y); // Read all neighbors and create opposite inbound values from their outbound ones
				int nextOutCelVal = createNextCell(inboundVal);
				nxtFrame.setCellOutValue(x, y, nextOutCelVal);
			}
		}
		return nxtFrame;
	}

	/* A pass-through rule, no collisions
	 * (non-Javadoc)
	 * @see edu.neu.csye6200.fluid.RuleI#createNextCell(int)
	 */
	@Override
	public int createNextCell(int inVal) {
		return inVal;
	}

}

package exceptions;

import cars.*;
import parts.*;


public class InsufficientPowerException extends Exception {
	
	private int required;

	public InsufficientPowerException(int required) {
		this.required = required;
	}

	public int getRequiredPower() { return required; }

}
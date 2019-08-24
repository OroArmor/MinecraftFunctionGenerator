package com.oroarmor.minecraftfunctions;

public class FunctionError extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FunctionError() {
	}

	public FunctionError(String arg0) {
		super(arg0);
	}

	public FunctionError(Throwable arg0) {
		super(arg0);
	}

	public FunctionError(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public FunctionError(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}

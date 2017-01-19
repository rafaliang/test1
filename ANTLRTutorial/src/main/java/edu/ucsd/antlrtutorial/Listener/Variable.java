package edu.ucsd.antlrtutorial.Listener;

/**
 * A Variable
 * 
 * @author ranaalotaibi
 *
 */
public class Variable {
	private String variableName;

	/**
	 * Create a variable.
	 * 
	 * @param vName
	 *            The variable name.
	 */
	public Variable(String vName) {
		variableName = vName;
	}

	/**
	 * Return the variable name
	 * 
	 * @return the variable name.
	 */
	public String returnVariableName() {
		return variableName;
	}

	@Override
	public String toString() {
		return variableName;
	}

}

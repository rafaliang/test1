/**
 * 
 */
package edu.ucsd.antlrtutorial.Listener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * A Condition
 * 
 * @author ranaalotaibi
 *
 */
public class Condition {
	private Variable	operand1;
	private String		operator;
	private Object		operand2;

	/**
	 * Create a Condition Clause
	 * 
	 * @param Condition
	 *            the Condition that is specified in the WhereClause
	 */
	public Condition(Variable operand1, String operator, Object operand2) {
		this.operand1 = operand1;
		this.operator = operator;
		this.operand2 = operand2;
	}

	/**
	 * @param val
	 *            the given Map/Relation ..etc
	 * @return the result after applying WhereClause within a given Map/Relation
	 *         ..etc
	 */
	public List<Map<String, Object>> executeConditionClause(List<Map<String, Object>> val) {
		Iterator<Map<String, Object>> iterateList = val.iterator();
		List<Map<String, Object>> conditionResult = new ArrayList<Map<String, Object>>();
		String value1;
		String value2;
		while (iterateList.hasNext()) {

			Map<String, Object> currentTuple = iterateList.next();
			value1 = ((String) currentTuple.get(operand1.toString()));
			if (operand2 instanceof Variable)
				value2 = ((String) currentTuple.get(operand2.toString()));
			else
				value2 = (String) operand2;
			if (value1.equals(value2.replaceAll("\'", ""))) {

				conditionResult.add(currentTuple);
			}
		}
		return conditionResult;
	}

	@Override
	public String toString() {
		StringBuilder statementClauseString = new StringBuilder();
		statementClauseString.append(operand1.returnVariableName());
		statementClauseString.append(operator);
		statementClauseString.append(operand2.toString());
		return statementClauseString.toString();
	}
}

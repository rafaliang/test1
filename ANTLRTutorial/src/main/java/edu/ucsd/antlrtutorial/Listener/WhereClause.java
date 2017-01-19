/**
 * 
 */
package edu.ucsd.antlrtutorial.Listener;

import java.util.List;
import java.util.Map;

/**
 * A Where Clause
 * 
 * @author ranaalotaibi
 *
 */
public class WhereClause {
	private Condition condition;

	/**
	 * Create a Where Clause
	 * 
	 * @param Condition
	 *            the Condition that is specified in the WhereClause
	 */
	public WhereClause(Condition condition) {
		this.condition = condition;
	}

	/**
	 * @param val
	 *            the given Map/Relation ..etc
	 * @return the result after applying WhereClause within a given Map/Relation
	 *         ..etc
	 */
	public List<Map<String, Object>> executeWhereClause(List<Map<String, Object>> val) {

		return condition.executeConditionClause(val);
	}

	@Override
	public String toString() {
		StringBuilder statementClauseString = new StringBuilder();
		statementClauseString.append("WHERE ");
		statementClauseString.append(condition.toString());
		return statementClauseString.toString();
	}
}

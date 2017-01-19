/**
 * 
 */
package edu.ucsd.antlrtutorial.Listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * A SELECT Clause
 * 
 * @author ranaalotaibi
 *
 */
public class SelectClause {
	private List<Variable> varList;

	/**
	 * Create a Select Clause
	 * 
	 * @param varlist
	 *            the variable list in the SELECT clause
	 */
	public SelectClause(List<Variable> varList) {
		this.varList = varList;
	}

	/**
	 * @param val
	 *            the given Map/Relation ..etc
	 * @return the result after applying SELECT within a given Map/Relation
	 *         ..etc
	 */
	public List<Map<String, Object>> executeSelectClause(List<Map<String, Object>> val) {
		Iterator<Map<String, Object>> iterateList = val.iterator();
		List<Map<String, Object>> selectResult = new ArrayList<Map<String, Object>>();

		while (iterateList.hasNext()) {

			Map<String, Object> currentTuple = iterateList.next();
			Map<String, Object> currentTupleProjecttion = new HashMap<String, Object>();

			for (Variable var : varList) {
				currentTupleProjecttion.put(var.returnVariableName(), currentTuple.get(var.returnVariableName()));
			}
			selectResult.add(currentTupleProjecttion);
		}
		return selectResult;
	}

	@Override
	public String toString() {
		StringBuilder statementClauseString = new StringBuilder();
		statementClauseString.append("SELECT ");
		boolean begin = true;
		for (Variable var : varList) {
			if (!begin)
				statementClauseString.append(",");
			begin = false;
			statementClauseString.append(var.toString());
		}
		return statementClauseString.toString();
	}
}

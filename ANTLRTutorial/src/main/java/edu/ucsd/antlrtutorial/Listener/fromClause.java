package edu.ucsd.antlrtutorial.Listener;

import java.util.List;
import java.util.Map;

/**
 * A From Clause
 * 
 * @author ranaalotaibi
 *
 */
public class fromClause {

	private String relation;

	/**
	 * Create a FROM clause.
	 * 
	 * @param relation
	 *            The realtion name that is specified in in the From Clause in
	 *            the query
	 */
	public fromClause(String relation) {
		this.relation = relation;
	}

	/**
	 * Apply a FROM clause evaluation within given relations
	 * 
	 * @param val
	 *            the given relations to be evaluated in FROM clause
	 * @return the result after applying FROM clause
	 */
	public List<Map<String, Object>> executeFromClause(Map<String, List<Map<String, Object>>> val) {

		return val.get(this.relation);

	}

	@Override
	public String toString() {

		StringBuilder fromClauseString = new StringBuilder();
		fromClauseString.append("FROM ");
		fromClauseString.append(this.relation);
		return fromClauseString.toString();
	}
}

package edu.ucsd.antlrtutorial.Listener;

import java.util.List;
import java.util.Map;

/**
 * 
 * A SELECT FROM WHERE Query
 * 
 * @author ranaalotaibi
 *
 */
public class SfwClause extends AbstractSQLQuery {
	private SelectClause	select;
	private fromClause		from;
	private WhereClause		where;

	/**
	 * Create a SELECT FROM WHERE (SFW) query.
	 * 
	 * @param from
	 *            the FROM clause.
	 * @param whereClause
	 *            the from Clause
	 * @param selectClause
	 *            the SELECT clause.
	 */
	public SfwClause(fromClause fromClause, SelectClause selectClause, WhereClause whereClause) {
		select = selectClause;
		from = fromClause;
		if (whereClause != null)
			where = whereClause;

	}

	/**
	 * Apply a sfw query within a given Map/Relation/..etc
	 * 
	 * @param val
	 *            the given Map/Relation..etc to be evaluated in sfw clause
	 * @return the result after applying sfw clause
	 */
	@Override
	public List<Map<String, Object>> eval(Map<String, List<Map<String, Object>>> val) {
		List<Map<String, Object>> fromClauseResult = from.executeFromClause(val);
		if (where != null) {
			List<Map<String, Object>> whereClauseResult = where.executeWhereClause(fromClauseResult);
			List<Map<String, Object>> result = select.executeSelectClause(whereClauseResult);
			return result;
		} else {
			List<Map<String, Object>> result = select.executeSelectClause(fromClauseResult);
			return result;
		}

	}

	@Override
	public String toString() {
		StringBuilder sfwClauseString = new StringBuilder();
		sfwClauseString.append(select.toString());
		sfwClauseString.append("\n");
		sfwClauseString.append(from.toString());
		sfwClauseString.append("\n");
		sfwClauseString.append(where.toString());

		return sfwClauseString.toString();
	}
}

package edu.ucsd.antlrtutorial.Listener;

import java.util.List;
import java.util.Map;

/**
 * A SQLquery.
 * 
 * @author ranaalotaibi
 *
 */
public interface SQLQuery {
	/**
	 * Execute SQLQuery Query
	 * 
	 * @param val
	 *            execute the query within a given Map/Relation/Environment..etc
	 * @return the result after executing the query
	 */
	public List<Map<String, Object>> eval(Map<String, List<Map<String, Object>>> val);
}

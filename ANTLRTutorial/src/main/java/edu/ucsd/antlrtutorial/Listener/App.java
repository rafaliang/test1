package edu.ucsd.antlrtutorial.Listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * CSE232B ANTLR Tutorial
 *
 */
public class App {
	public static void main(String[] args) {
		SQLQueryCompiler sqlParser = new SQLQueryCompiler();
		// SQLQuery query = sqlParser.parse("SELECT city,state FROM info WHERE
		// state=\'WA\' ");
		SQLQuery query = sqlParser.parse("SELECT fname,lname FROM info WHERE skill =\'C++\' ");

		// DataModel-- List of Maps each Map shows a tuple in Relational
		// Database
		Map<String, List<Map<String, Object>>> realtions = new HashMap<String, List<Map<String, Object>>>();
		List<Map<String, Object>> info = new ArrayList<Map<String, Object>>();
		// Tuple#1
		Map<String, Object> tuple1 = new HashMap<String, Object>();
		tuple1.put("fname", "David");
		tuple1.put("lname", "Nelson");
		tuple1.put("skill", "JAVA");
		tuple1.put("city", "Seattle");
		tuple1.put("state", "WA");
		// Tuple#2
		Map<String, Object> tuple2 = new HashMap<String, Object>();
		tuple2.put("fname", "Nora");
		tuple2.put("lname", "Smith");
		tuple2.put("skill", "C++");
		tuple2.put("city", "SD");
		tuple2.put("state", "CA");
		// --------------------------------------------------------------------------//
		info.add(tuple1);
		info.add(tuple2);
		// Create a relation info that has the above info
		realtions.put("info", info);
		List<Map<String, Object>> result = query.eval(realtions);
		Iterator<Map<String, Object>> resultIterator = result.iterator();
		// Show Result
		while (resultIterator.hasNext()) {
			for (Map.Entry<String, Object> entry : resultIterator.next().entrySet()) {
				System.out.println("\n" + entry.getKey() + " : " + entry.getValue());
				System.out.println("---------------------------");
			}
		}
	}
}

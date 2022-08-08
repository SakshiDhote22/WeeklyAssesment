
/*Write a program that will have a Properties class object which is capable of storing some States of India
and their Capital. Use an Iterator to list all the elements stored in the Properties.
*/


/*
import java.util.*;
import java.util.Map.Entry;

class Properties {
	HashMap<String, String> india = new HashMap<>();

	public void addProperties(String state, String capital) {
		india.put(state, capital);
	}

	public String isKeyExist(String state) {
		Set<Entry<String, String>> set = india.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();

			if (me.getKey().equals(state)) {
				return state + "Key is present ";
			}
		}

		return state + "Key is not present ";
	}

	public String isValueExist(String capital) {
		Set<Entry<String, String>> set = india.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			if (me.getValue().equals(capital)) {

				return capital + "value is present ";
			}
		}
		return capital + " value is not present ";

	}

	public void allProperties() {
		Set<Entry<String, String>> set = india.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me);
		}

	}
}

public class StateCapital {

	public static void main(String[] args) {
		Properties p = new Properties();

		p.addProperties("Maharashtra", "Mumbai");
		p.addProperties("Rajasthan", "Jaipur");
		p.addProperties("Goa", "Panji");

		p.allProperties();

	}

}
*/


import java.util.*;
import java.util.Map.Entry;
import java.util.Properties;


public class StateCapital {
	
	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("Maharashtra", "Mumbai");
		p.setProperty("Madhya Pradesh", "Bhopal");
		p.setProperty("Bihar", "Patna");
		p.setProperty("Rajasthan", "Jaipur");
		p.setProperty("Goa", "Panji");

		Set<Entry<Object, Object>> set = p.entrySet();
		Iterator<Entry<Object, Object>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<Object, Object> e = itr.next();
			System.out.println(e);
		}
}
}

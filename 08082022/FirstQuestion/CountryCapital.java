/* Develop a java class with a instance variable M1 (HashMap) create a method saveCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country Value - Capital
India Delhi
Japan Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key – Capital Value – Country
Delhi India
Tokyo Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method. */

import java.util.*;
import java.util.Map.Entry;

class CountryCapitalList{
	HashMap<String, String> M1 = new HashMap<>();
	
	public void saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName,capital);
	}
	
	public String getCapital(String CountryName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getKey().equals(CountryName)) {
				return me.getValue();
			}
		}
		
		return "Capital is not present ";
	}
	
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName)) {
				return me.getKey();
			}
		}
		
		return "Country is not present ";
	}
	
	public HashMap<String, String> swapCountryCapital() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> ArrayLisMethodt() {
ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;

	}
}

public class CountryCapital {

	public static void main(String[] args) {
		
		CountryCapitalList c = new CountryCapitalList();
		
		c.saveCountryCapital("India", "Delhi");
		c.saveCountryCapital("Japan", "Tokyo");
		c.saveCountryCapital("USA", "UK");
				
		System.out.println("India "+c.getCapital("India"));
		System.out.println("UK "+c.getCountry("UK"));
		System.out.println(c.ArrayLisMethodt());
		
		HashMap<String, String> M2 = c.swapCountryCapital();
		System.out.println(M2);

	}

}

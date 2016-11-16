package demoProject;

import java.util.ArrayList;
import java.util.List;

public class ProovClass {
	public static void main(String[] args) {
		MyJSONObject obj = new MyJSONObject();
		obj.put("name", "Kalle");
		obj.put("age", 56);
		obj.put("isActive", false);
		
		String jsonString = obj.JSONString(); // { "name" : "Kalle", "age" : 56, "isActive" : false }
//		Person kalle = obj.toJavaObject();
		System.out.println(jsonString);
	}
}

class MyJSONObject {
    
	private List<Object> keyList = new ArrayList<>();
	private List<Object> valueList = new ArrayList<>();
	
	public void put(String key, Object value) {
		keyList.add(key);
		valueList.add(value);
	}

	public String JSONString() {
		List<String> wList = new ArrayList<>();
		for (int i = 0; i < keyList.size(); i++) {

			if (valueList.get(i).getClass().equals(String.class)) {
				wList.add("\""+ keyList.get(i) + "\"" + ": " + "\"" + valueList.get(i)+"\"");
				
			}else {
				wList.add("\""+ keyList.get(i) + "\"" + ": " + valueList.get(i));				
			}	
		}
		return "{"+ wList.toString().substring(1, (wList.toString().length()-1))+"}";
	}

	public Person toJavaObject() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Person {

}

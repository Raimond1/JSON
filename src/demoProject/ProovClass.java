package demoProject;

import java.util.ArrayList;
import java.util.List;

public class ProovClass {
	public static void main(String[] args) {
		MyJSONObject obj = new MyJSONObject();
		obj.put("name", "Kalle");
		obj.put("age", 56);
		obj.put("isActive", false);
		
		String jsonString = obj.JSONString(); // { "name" : "Kalle", "age" : 56 }
//		Person kalle = obj.toJavaObject();
		
	}
}

class MyJSONObject {
    
	private List<Object> keyList = new ArrayList<>();
	private List<Object> valueList = new ArrayList<>();
	public void put(String key, Object value) {
		keyList.add(key);
		valueList.add(value);
	}


	public Person toJavaObject() {
		// TODO Auto-generated method stub
		return null;
	}

	public String JSONString() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Person {

}

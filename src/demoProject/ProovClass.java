package demoProject;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.ParseConversionEvent;

public class ProovClass {
	public static void main(String[] args) {
		MyJSONObject obj = new MyJSONObject();
		obj.put("name", "Kalle");
		obj.put("age", 56);
		obj.put("isActive", false);

		String jsonString = obj.JSONString(); // { "name" : "Kalle", "age" : 56,
												// "isActive" : false }
		Person kalle = obj.toJavaObject();
		System.out.println(jsonString);
		System.out.println(kalle);

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
				wList.add("\"" + keyList.get(i) + "\"" + ": " + "\"" + valueList.get(i) + "\"");

			} else {
				wList.add("\"" + keyList.get(i) + "\"" + ": " + valueList.get(i));
			}
		}
		return "{" + wList.toString().substring(1, (wList.toString().length() - 1)) + "}";
	}

	public Person toJavaObject() {
		Person person  = new Person();
		
		String name = valueList.get(0).toString();
		String age = valueList.get(1).toString();
		String isActive = valueList.get(2).toString();
		
		person.setName(name);
		person.setAge(Integer.parseInt(age));
		person.setIsActive(Boolean.parseBoolean(isActive));
		
		return person;
	}

}

class Person {
	private String name;
	private Integer age;
	private Boolean isActive;



	//getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isActive=" + isActive + "]";
	}
	

}

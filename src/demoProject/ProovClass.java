package demoProject;

public class ProovClass {

	public static void main(String[] args) {
		MyJSONObject obj = new MyJSONObject();
		obj.put("name", "Kalle");
		obj.put("age", 56);

		String jsonString = obj.JSONString();

		Person kalle = obj.toJavaObject();
		}

}

class MyJSONObject {

	public void put(String string, int i) {
		// TODO Auto-generated method stub

	}

	public void put(String string, String string2) {
		// TODO Auto-generated method stub

	}

}

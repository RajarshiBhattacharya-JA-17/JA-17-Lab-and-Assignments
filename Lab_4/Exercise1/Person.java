package exercise1;

public class Person {

	private String name;
	private float age;
	
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Person(){
		
	}
	
	Person(String name, float age)
	{
		this.name = name;
		this.age= age;
	}
}

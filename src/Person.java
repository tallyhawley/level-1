
public class Person {
	private String name;
	private int age;
	private static int num = 0;
	
	public Person(String name){
		this.name = name;
		num++;
	}
	
	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public static void getNum(){
		System.out.println("There are "+num+" people in this class.");
	}
	
	public String toString(){
		return name;
	}
}


public class FamilyMember {
	int age;
	String name;
	
	public FamilyMember(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int compareTo(FamilyMember otherMember) {
		int compareQuantity = otherMember.getAge();
		

		// return this.age - compareQuantity; //ascending order
		return compareQuantity - this.age; // descending order
	}
}


public class PersonRunner {
	public static void main(String[] args){
		Person a = new Person("Stirling");
		Person b = new Person("Ella");
		Person c = new Person("Quentin");
		a.setAge(15);
		b.setAge(14);
		c.setAge(14);
		Person.getNum();
		System.out.println(a.toString());
	}
}

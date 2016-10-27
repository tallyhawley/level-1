import java.util.Random;

public class Book {
	int length;
	String title;
	public Book(int length, String title){
		this.length = length;
		this.title = title;
	}
	public void getSummary(){
		System.out.println("A man finds the adventure of a lifetime in this new thriller by Kephen Sting.\n"
				+ "What will he find in the abandoned house of old Fr. Drankenstein?\n"
				+ "Find out now in "+title+"!");
	}
	public void amountRead(){
		int amount;
		amount = new Random().nextInt(100);
		System.out.println("You have read "+amount+"% of "+title+".");
	}

}

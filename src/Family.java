import java.util.ArrayList;
import java.util.Collections;

public class Family {
	ArrayList<FamilyMember> family = new ArrayList<FamilyMember>();
	
	public void addMember(FamilyMember member){
		family.add(member);
	}
	
	public void sortByAge(){
		Collections.sort(family);
	}
	
}

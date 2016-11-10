
public class VaultRun {
	public static void main(String[] args){
		Vault a = new Vault();
		System.out.println(a.tryCode(12452));
		System.out.println(Bond.findCode(a));
	}
}

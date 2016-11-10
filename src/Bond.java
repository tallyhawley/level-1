
public class Bond {

	public static int findCode(Vault vault){
		for(int i=0;i<=1000000;i++){
			vault.tryCode(i);
			if(vault.tryCode(i)){
				return i;
			}
		}
		return -1;
	}
}

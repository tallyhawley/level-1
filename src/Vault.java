import java.util.Random;

public class Vault {
	private int code;
	
	public Vault(){
		code = new Random().nextInt(1000001);
	}
	
	public Vault(int code){
		if (code <=1000000){
			this.code = code;
		}else{
			System.out.println("Invalid code, generating random number.");
			this.code = new Random().nextInt(1000001);
		}
	}
	
	public boolean tryCode(int num){
		if(num == code){
			return true;
		}
		else{
			return false;
		}
	}
}

//Stephen LaFrankie
import java.util.Random;
public class password implements Encryptable
{
	Random r = new Random();
	private String password;
	private String masked;
	private boolean encrypt;
	private int add;

	public password(String p)
	{
		password = p;
		add = r.nextInt(20)+2;
		encrypt = false;
	}
	public void encrypt()
	{
		if(!encrypt)
		{
			masked = "";
			for(int n = 0; n<password.length(); n++)
			{

			}
			password = masked;
			encrypt = true;
		}

	}
	public String decrypt()
	{
		if(encrypt)
		{
			String unmasked = "";
			for(int n = 0; n<password.length(); n++)
			{

			}
			password = unmasked;
			encrypt = true;
		}
		return password;
	}
	public boolean Encrypted()
	{
		return encrypt;
	}
	public String toString()
	{
		return password;
	}

}
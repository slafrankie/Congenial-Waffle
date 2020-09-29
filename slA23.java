import java.util.Scanner;
//Stephen LaFrankie
public class slA23
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.print("Password: ");
		String pass = key.nextLine();

		System.out.println("Password is "+pass);

		Secret a = new Secret(pass);
		password b = new password(pass);

		a.encrypt();
		System.out.println(a);
		a.decrypt();
		System.out.println(a);

		b.encrypt();
		System.out.println(b);
		b.decrypt();
		System.out.println(b);







	}
}
import java.util.Scanner;  
//Stephen LaFrankie
public class slA23
/*main class acts as control method for this encryption/inheritance program.
  Prompts user for a made-up password and passes it to a string. From there
  the string is then passed to a and b and sent to the assigned locations.
*/
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.print("Password: ");
		String pass = key.nextLine();

		System.out.println("Password is "+pass);

		Secret a = new Secret(pass);
		password b = new password(pass);
                
                //both secret and password classes essentially do the same thing

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
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// startup dialogue

		System.out.println("Hi.  I'm FortuneBot.  I'll tell you your fortune if you tell me some stuff first.");
		System.out.println("You can quit at any time by typing \"quit\", but I wouldn't recommend it.");
		System.out.println("You wouldn't like me when I'm angry.");
		System.out.println();

		// get first name

		System.out.println("To start with, give me your first name.");
		String firstName = input.next().trim();
		System.out.println();
		if (firstName.equalsIgnoreCase("quit")) {
			System.out.println("Fine.  Be that way.  Nobody likes a quitter, though.");
			System.out.println("May a thousand angry camels spit in your face.");
			System.exit(0);
		}

		// get last name

		System.out.println("Next, tell me your last name.");
		String lastName = input.next().trim();
		System.out.println();
		if (lastName.equalsIgnoreCase("quit")) {
			System.out.println("Fine.  Be that way.  Nobody likes a quitter, though.");
			System.out.println("May a thousand angry camels spit in your face.");
			System.exit(0);
		}

		// get age

		System.out.println("OK, now I need your age.");
		String ageString = input.next().trim();
		System.out.println();
		if (ageString.equalsIgnoreCase("quit")) {
			System.out.println("Fine.  Be that way.  Nobody likes a quitter, though.");
			System.out.println("May a thousand angry camels spit in your face.");
			System.exit(0);
		}
		int age = Integer.parseInt(ageString);

		// get birth month

		System.out.println("I also need your birth month, but give it to me as a number, not a word.");
		System.out.println("(e.g. for January, type 1, for February, type 2, etc.)");
		String monthString = input.next().trim();
		System.out.println();
		if (firstName.equalsIgnoreCase("quit")) {
			System.out.println("Fine.  Be that way.  Nobody likes a quitter, though.");
			System.out.println("May a thousand angry camels spit in your face.");
			System.exit(0);
		}
		int month = Integer.parseInt(monthString);

		// get favorite color

		while (true) {

			System.out.println("So, what's your favorite ROYGBIV color?");
			System.out.println("Type \"help\" if you never learned what ROYGBIV means when you were in grade school.");
			String color = input.next().trim();
			System.out.println();
			if (color.equalsIgnoreCase("quit")) {
				System.out.println("Fine.  Be that way.  Nobody likes a quitter, though.");
				System.out.println("May a thousand angry camels spit in your face.");
				System.exit(0);
			} else if (color.equalsIgnoreCase("help")) {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
				System.out.println("Pick one of those.");
				System.out.println();
			} else break;
		}
		
		//get number of siblings
		
		System.out.println("Last one.  Tell me how many siblings you have.  Type it as a number, thanks.");
		String siblingsString = input.next().trim();
		System.out.println();
		if (ageString.equalsIgnoreCase("quit")) {
			System.out.println("Fine.  Be that way.  Nobody likes a quitter, though.");
			System.out.println("May a thousand angry camels spit in your face.");
			System.exit(0);
		}
		int siblings = Integer.parseInt(siblingsString);
		
		//parse input and assign to output variables
		
		
		
		input.close();

	}

}

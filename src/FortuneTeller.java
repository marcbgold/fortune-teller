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
		if (monthString.equalsIgnoreCase("quit")) {
			System.out.println("Fine.  Be that way.  Nobody likes a quitter, though.");
			System.out.println("May a thousand angry camels spit in your face.");
			System.exit(0);
		}
		int month = Integer.parseInt(monthString);

		// get favorite color

		String color = "";
		while (true) {
			System.out.println("So, what's your favorite ROYGBIV color?");
			System.out.println("Type \"help\" if you never learned what ROYGBIV means when you were in grade school.");
			color = input.next().trim();
			System.out.println();
			if (color.equalsIgnoreCase("quit")) {
				System.out.println("Fine.  Be that way.  Nobody likes a quitter, though.");
				System.out.println("May a thousand angry camels spit in your face.");
				System.exit(0);
			} else if (color.equalsIgnoreCase("help")) {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
				System.out.println("Pick one of those.");
				System.out.println();
			} else
				break;
		}

		// get number of siblings

		System.out.println("Last one.  Tell me how many siblings you have.  Type it as a number, thanks.");
		String siblingsString = input.next().trim();
		System.out.println();
		if (siblingsString.equalsIgnoreCase("quit")) {
			System.out.println("Fine.  Be that way.  Nobody likes a quitter, though.");
			System.out.println("May a thousand angry camels spit in your face.");
			System.exit(0);
		}
		int siblings = Integer.parseInt(siblingsString);

		// parse input and assign to output variables

		// get age fortune

		String numOfYears = "";
		if (age % 2 == 0) {
			numOfYears = "2 years";
		} else {
			numOfYears = "42 years";
		}

		// get birth month fortune

		String bankBalance = "";
		if (month >= 1 && month <= 4) {
			bankBalance = "$270,832.00";
		} else if (month >= 5 && month <= 8) {
			bankBalance = "$60,985.40";
		} else if (month >= 9 && month <= 12) {
			bankBalance = "$100,000,000.00";
		} else {
			bankBalance = "$3.14";
		}

		// get color fortune

		String modeOfTransport = "";
		switch (color.toLowerCase()) {
		case "red":
			modeOfTransport = "elephant";
			break;
		case "orange":
			modeOfTransport = "blimp";
			break;
		case "yellow":
			modeOfTransport = "busted old pickup truck";
			break;
		case "green":
			modeOfTransport = "F-15";
			break;
		case "blue":
			modeOfTransport = "spaceship";
			break;
		case "indigo":
			modeOfTransport = "bobsled";
			break;
		case "violet":
			modeOfTransport = "teleportation";
			break;
		default:
			modeOfTransport = "being dragged through the mud by a donkey";
			break;
		}

		// get number of siblings fortune

		String location = "";
		if (siblings < 0) {
			location = "an active volcano";
		} else if (siblings == 0) {
			location = "Tokyo, Japan";
		} else if (siblings == 1) {
			location = "Paris, France";
		} else if (siblings == 2) {
			location = "Sydney, Australia";
		} else if (siblings == 3) {
			location = "Miami Beach, FL";
		} else {
			location = "a colony on the Moon";
		}

		// print fortune
		
		System.out.println("OK, I've got it.  Here's your fortune:");
		System.out.println();
		System.out.print(firstName + " " + lastName + " will retire in " + numOfYears + " with " + bankBalance + " in the bank and ");
		System.out.println("a vacation home in " + location + ", and will travel by " + modeOfTransport + ".");
		System.out.println();
		System.out.println("Want another fortune?  Run me again.  Otherwise, go away.  I have other things to do.");
				
		input.close();

	}

}

/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Siju Philip
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Dec 8th, 2021
 * Modified: Dec 8th, 2021
 * Description: This class will prompt the user with three option. 1 option to
 * edit the length of the pencil, 2 option to print the estimate the number of 
 * pages. The last option is to stop the program.

/*
 * This class will the prompt the user with three options. 
 */
public class IshtiaqueMatin_LabExam2_363 {

	/*
	 * the method prompts the user to enter data and make a choice
	 */
	public static void main(String[] args) {

		// declaration
		final int EDIT_MECHANICAL_PENCIL = 1;
		final int PRINT_MECHANICAL_PENCIL = 2;
		final int EXIT_MECHANICAL_PENCIL = 3;
		int option = 0;

		String formatString = "%d %s%n";

		double length = 0;
		double width = 0;
		MechanicalPencil mp1 = new MechanicalPencil();

		do {
			System.out.printf("%s%n", "Select Option:");
			System.out.printf(formatString, EDIT_MECHANICAL_PENCIL, "to edit mechanical pencil");
			System.out.printf(formatString, PRINT_MECHANICAL_PENCIL, "to show estimated pages");
			System.out.printf(formatString, EXIT_MECHANICAL_PENCIL, "to exit program");
			// the program the name of the programmer
			System.out.printf("%s%n", "Program by Ishtiaque Matin");
			option = User.inputInteger("Enter option: ");
			switch (option) {
			case EDIT_MECHANICAL_PENCIL:

				length = User.inputDouble("Enter Length: ");
				width = User.inputDouble("Enter Width: ");

				mp1.setLength(length);
				mp1.setWidth(width);

				break;
			case PRINT_MECHANICAL_PENCIL:

				System.out.println("Estimated Pages: " + mp1.estimatePages());

				break;
			case EXIT_MECHANICAL_PENCIL:
				System.out.printf("%s%n", "\nProgram Exits");
				break;
			default:
				System.out.printf("%s%n", "\nInvalid Menu Input");
				break;

			}

			// empty line
			System.out.println();

		} while (option != 3);

	}
}

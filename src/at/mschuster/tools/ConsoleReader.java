package at.mschuster.tools;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Freedom
 * This class is for easy reading text from the command line and return it as String
 *
 */
public class ConsoleReader {

	/**
	 * @return the input of the line (including everything until enter is pressed)
	 */
	public static String readLine() {
		String input = null;

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		Scanner scanner = new Scanner(inputStreamReader);
		input = scanner.nextLine();

		while (input == null) {
			scanner.close();
		}
		scanner.reset();

		return input;
	}

	/**
	 * @param preText means the text which is shown in command line before the input text gets written
	 * @return the input of the line (including everything until enter is pressed)
	 */
	public static String readLine(String preText) {
		//
		String input = null;
		System.out.print(preText + " > ");

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		Scanner scanner = new Scanner(inputStreamReader);
		input = scanner.nextLine();

		while (input == null) {
			scanner.close();
		}
		scanner.reset();

		return input;
	}
}

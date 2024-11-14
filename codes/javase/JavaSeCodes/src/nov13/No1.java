package nov13;

import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your fav season...");
		String seasonInput = scanner.nextLine().toUpperCase();
		Seasons season = Seasons.valueOf(seasonInput);
		switch (season) {
		case SUMMER:
			System.out.println("\r\n"
					+ "                                           \r\n"
					+ "  ________ __  _____   _____   ___________ \r\n"
					+ " /  ___/  |  \\/     \\ /     \\_/ __ \\_  __ \\\r\n"
					+ " \\___ \\|  |  /  Y Y  \\  Y Y  \\  ___/|  | \\/\r\n"
					+ "/____  >____/|__|_|  /__|_|  /\\___  >__|   \r\n"
					+ "     \\/            \\/      \\/     \\/       \r\n"
					+ "");
			break;
		case SPRİNG:
			System.out.println("\r\n"
					+ "                     .__                \r\n"
					+ "  ___________________|__| ____    ____  \r\n"
					+ " /  ___/\\____ \\_  __ \\  |/    \\  / ___\\ \r\n"
					+ " \\___ \\ |  |_> >  | \\/  |   |  \\/ /_/  >\r\n"
					+ "/____  >|   __/|__|  |__|___|  /\\___  / \r\n"
					+ "     \\/ |__|                 \\//_____/  \r\n"
					+ "");
			break;	
		case AUTUMN:
			System.out.println("\r\n"
					+ "               __                        \r\n"
					+ "_____   __ ___/  |_ __ __  _____   ____  \r\n"
					+ "\\__  \\ |  |  \\   __\\  |  \\/     \\ /    \\ \r\n"
					+ " / __ \\|  |  /|  | |  |  /  Y Y  \\   |  \\\r\n"
					+ "(____  /____/ |__| |____/|__|_|  /___|  /\r\n"
					+ "     \\/                        \\/     \\/ \r\n"
					+ "");
			break;
		case WİNTER:
			System.out.println("\r\n"
					+ "        .__        __                \r\n"
					+ "__  _  _|__| _____/  |_  ___________ \r\n"
					+ "\\ \\/ \\/ /  |/    \\   __\\/ __ \\_  __ \\\r\n"
					+ " \\     /|  |   |  \\  | \\  ___/|  | \\/\r\n"
					+ "  \\/\\_/ |__|___|  /__|  \\___  >__|   \r\n"
					+ "                \\/          \\/       \r\n"
					+ "");
			break;
		default:
			System.out.println("\r\n"
					+ "   _____  _______      _____                    __      _____                        .___\r\n"
					+ "  /  |  | \\   _  \\    /  |  |      ____   _____/  |_  _/ ____\\____  __ __  ____    __| _/\r\n"
					+ " /   |  |_/  /_\\  \\  /   |  |_    /    \\ /  _ \\   __\\ \\   __\\/  _ \\|  |  \\/    \\  / __ | \r\n"
					+ "/    ^   /\\  \\_/   \\/    ^   /   |   |  (  <_> )  |    |  | (  <_> )  |  /   |  \\/ /_/ | \r\n"
					+ "\\____   |  \\_____  /\\____   |    |___|  /\\____/|__|    |__|  \\____/|____/|___|  /\\____ | \r\n"
					+ "     |__|        \\/      |__|         \\/                                      \\/      \\/ \r\n"
					+ "");
			break;
		}

	}

}

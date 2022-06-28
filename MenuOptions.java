package com.jakhmola.finalproject;

public class MenuOptions {

	public static void printWelcomeScreen(String appName, String developerName) {
		
		String companyName = "        *******************************\n"
							 +"          Super Bond Lockers Pvt. Ltd  \n"
							 +"        *******************************\n\n\n";
		String appFunction ="*********** You can use this application for ************\n\n" 				
				+ "• Retrieve all file names in the \"main\" folder\n"
				+ "• Search, add, or delete files in \"main\" folder.\n";					

		System.out.println(companyName + appFunction);
	}

	public static void displayMenu() {
		String menu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Retrieve all files inside \"main\" folder\n" 
				+ "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}

}

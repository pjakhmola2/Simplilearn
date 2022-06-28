package com.jakhmola.finalproject;

public class SuperMain  {

	public static void main(String[] args) {
		
		FileOperations.createMainFolderIfNotPresent("main");

		MenuOptions.printWelcomeScreen("Super Bond Lockers Pvt. Ltd", "Priyanshu Jakhmola");

		HandleOptions.handleWelcomeScreenInput();
	}

}

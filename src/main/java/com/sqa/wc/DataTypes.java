/**
 *   File Name: dataTypes.java<br>
 *
 *   Chan, William<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 7, 2017
 *
 */

package com.sqa.wc;

import com.sqa.wc.helpers.*;

/**
 * dataTypes //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chan, William
 * @version 1.0.0
 * @since 1.0
 *
 */

public class DataTypes {

	static String appName = "Data Types";

	static String dataTypeString;
	static char dataTypeChar;
	static Float dataTypeFloat;
	static Short dataTypeShort;
	static Long dataTypeLong;
	static Boolean dataTypeBoolean;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String user = AppBasics.welcomeUserAndName(appName);
		askUser();
		AppBasics.farewellUser(appName, user);
	}

	private static void askUser() {

		/*
		 * Create a repository named "data-types-project" based on
		 * basic-project. Create an application which asks the user for each
		 * data-type by using the helper methods of AppBasics listed above and
		 * sets the value to a variable. Once you have collected all the data
		 * types display them all at once to the user before exiting the system.
		 */

		dataTypeString = AppBasics.requestString("Please enter a string...");
		dataTypeChar = AppBasics.requestChar("Please enter a character...");
		dataTypeFloat = AppBasics.requestFloat("Please enter a number...");
		dataTypeShort = AppBasics.requestShort("Please enter another number...");
		dataTypeLong = AppBasics.requestLong("Please enter a longer number...");
		dataTypeBoolean = AppBasics.requestBoolean("Is it true or false?");
		System.out.println("You have entered " + dataTypeString + " ," + dataTypeChar + " ," + dataTypeFloat + " ,"
				+ dataTypeShort + " ," + dataTypeLong + " ," + dataTypeBoolean);

	}

}

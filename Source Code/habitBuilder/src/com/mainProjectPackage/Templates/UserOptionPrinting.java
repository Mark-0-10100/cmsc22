package com.mainProjectPackage.Templates;

import static com.mainProjectPackage.Templates.LinePrinting.printLineForUI;

/**
 * The methods in this class are called
 * in order to print the available options users can take.
 *
 * This is for printing purposes only
 */
public class UserOptionPrinting {

    /**
     * This method prints out the Options the user
     * can choose in the "Home Page"
     */
    public static void printHomepageUserOptions(){
        System.out.println("\t\t(1) Reward System\n\n" +
                "\t\t(2) Workout Tracker\n\n" +
                "\t\t(3) Food Tracker\n\n" +
                "\t\t(4) ToDo Tracker\n\n");
    }

    /**
     * This method prints out the Options the user
     * can choose in the "Reward System page"
     */
    public static void printRewardSystemMainPage_UserOptions(){
        System.out.println("(1) Add habit in table\n" +
                "(2) Delete habit in table\n" +
                "(3) Accomplish Habit  \n" +
                "(4) Open Market and Inventory for Rewards \n" +
                "(5) Go back to homepage");
        printLineForUI();
    }

    /**
     * This method prints out the Options the user
     * can choose in the "Marketplace and Inventory page"
     */
    public static void printMarketAndInvent_UserOptions() {
        System.out.println("(1) Add reward item in Market table\n" +
                "(2) Delete reward item in Market table\n" +
                "(3) Buy reward item in Market table \n" +
                "(4) Use reward item in Inventory table \n" +
                "(5) Go back to Habit Table Page\n");
        printLineForUI();
    }


}

package com.mainProjectPackage.rewardSystem;

import com.mainProjectPackage.Templates.PageFactory;

import static com.mainProjectPackage.Templates.LinePrinting.*;
import static com.mainProjectPackage.Templates.ScanUserOption.askUserOption;
import static com.mainProjectPackage.Templates.UserOptionPrinting.printRewardSystemMainPage_UserOptions;
import static com.mainProjectPackage.rewardSystem.habitTable.HabitTableMain.showHabitTable;

/**
 * This class is the Reward System's main page,
 * this is where most of the printing and method calls happen
 *
 */
public class RewardSystemMainPage {

    //Stores balance for habit points
    public static double balanceNum;
    public static String balance_text = "Balance: " + String.valueOf(balanceNum) + " Habit points";

    /**
     * A method that is called in order to display the "Reward System page"
     */
    public static void showRewardSystemMainPage() {

        printLineForNewPage();

        printTopBotLines();
        System.out.println("\t\tReward System");    //Title of the page
        printLineForUI();
        System.out.println(balance_text);               //Prints out the balance
        printLineForUI();
        showHabitTable();                               //Prints the habit table
        System.out.println("Homepage>Reward System");   //This is for printing Page directory as a guide for Users
        printTopBotLines();

        printRewardSystemMainPage_UserOptions();

        //This is for asking UserInput
        Integer chosenUserOption = askUserOption();
        PageFactory.makePageRewardSystem(chosenUserOption);     //calls the factory method for creating new pages
    }
}

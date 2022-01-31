package com.mainProjectPackage;

import static com.mainProjectPackage.Templates.LinePrinting.*;
import static com.mainProjectPackage.Templates.ScanUserOption.askUserOption;
import static com.mainProjectPackage.Templates.UserOptionPrinting.printHomepageUserOptions;
import static com.mainProjectPackage.rewardSystem.RewardSystemMainPage.showRewardSystemMainPage;

/**
 * This class is the application's Homepage,
 * this serves as the "starter" since it contains the
 * showHomePage() which prints the very first page
 * for the user
 *
 */
public class HomePage {
    /**
     * This method prints out the Home Page,
     * it is called by the main method
     */
    public static void showHomePage(){

        printTopBotLines();
        System.out.println("\t\tHABIT BUILDER");
        printLineForUI();

        printHomepageUserOptions();
        printTopBotLines();

        //Asks for User Input
        Integer chosenUserOption = askUserOption();

        //Goes to the RewardSystem Feature
        if(chosenUserOption == 1){
            showRewardSystemMainPage();
        } else {  //Other features not available
            System.out.println("**********Feature is not yet Available*************");
            showHomePage();
        }
    }


}

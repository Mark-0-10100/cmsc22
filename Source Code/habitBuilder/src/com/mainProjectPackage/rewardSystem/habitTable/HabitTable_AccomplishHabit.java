package com.mainProjectPackage.rewardSystem.habitTable;

import com.mainProjectPackage.Templates.Template_ManipulateTable;
import com.mainProjectPackage.rewardSystem.RewardSystemMainPage;

import java.util.Scanner;

import static com.mainProjectPackage.rewardSystem.RewardSystemMainPage.balanceNum;
import static com.mainProjectPackage.Templates.LinePrinting.printLineForNewPage;
import static com.mainProjectPackage.Templates.LinePrinting.printLineForUI;
import static com.mainProjectPackage.rewardSystem.habitTable.HabitTableMain.showHabitTable;

/**
 * Extends from an abstract class (which is the base template) used when
 * elements are to be manipulated in a table.
 * For this class we are accessing an element to use its data such as taking
 * the corresponding reward points of the habit we accomplished from the table
 *
 */
public class HabitTable_AccomplishHabit extends Template_ManipulateTable {

    /**
     * Prints some text labels for the User Interface
     */
    @Override
    public void printTextLabels() {
        printLineForNewPage();
        System.out.println("Reward System -> Accomplish Habit");
        printLineForUI();
        showHabitTable();
        System.out.println("Enter the number that corresponds to \nthe habit you accomplished in the table");
        printLineForUI();
        System.out.print("[INPUT int] Enter num:");
    }

    /**
     * Scan the user input and store it in a variable
     */
    @Override
    public void askUserForInput() {
        Scanner scanAccomplished_InTable= new Scanner(System.in);
        HabitTableMain.storeAccomplishedReferenceNum = scanAccomplished_InTable.nextInt();

    }

    /**
     * Takes the corresponding reward points data of the habit
     * and adds it to the user's balance
     */
    @Override
    public void modifyElementInTable() {
        //Adds the reward points for accomplishing habit
        double CorrespondingReward = HabitTableMain.habitReward.get(HabitTableMain.storeAccomplishedReferenceNum-1);
        balanceNum += CorrespondingReward;
        RewardSystemMainPage.balance_text = "Balance: " + String.valueOf(balanceNum) + " Habit points";


    }
}

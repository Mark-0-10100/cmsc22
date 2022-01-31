package com.mainProjectPackage.rewardSystem.habitTable;

import com.mainProjectPackage.Templates.Template_ManipulateTable;

import java.util.Scanner;

import static com.mainProjectPackage.Templates.LinePrinting.printLineForNewPage;
import static com.mainProjectPackage.Templates.LinePrinting.printLineForUI;
import static com.mainProjectPackage.rewardSystem.habitTable.HabitTableMain.showHabitTable;

/**
 * Extends from an abstract class (which is the base template) used when
 * elements are to be manipulated in a table.
 * For this class we are just deleting an element (habit) to the table
 *
 */
public class HabitTable_Deleting extends Template_ManipulateTable {
    /**
     * Prints some text labels for the User Interface
     */
    @Override
    public void printTextLabels() {
        printLineForNewPage();
        System.out.println("Reward System> Delete Habit in table");
        printLineForUI();
        showHabitTable();
    }

    /**
     * Scan the user input and store it in a variable
     */
    @Override
    public void askUserForInput() {
        System.out.println("Delete by entering the number that corresponds\n" +
                " to the habit you want to remove in the table");
        printLineForUI();
        System.out.print("[INPUT int] Enter num:");

        //Scanners
        Scanner scanDelete_InTable= new Scanner(System.in);
        HabitTableMain.storeDeletionReferenceNum = scanDelete_InTable.nextInt(); //Variable for stored Category


    }

    /**
     * Deletes the specified element by the user
     */
    @Override
    public void modifyElementInTable() {
        //Deletes the element using a reference number to the index
        HabitTableMain.habitDescription.remove(HabitTableMain.storeDeletionReferenceNum-1);
        HabitTableMain.habitReward.remove(HabitTableMain.storeDeletionReferenceNum-1);
    }
}

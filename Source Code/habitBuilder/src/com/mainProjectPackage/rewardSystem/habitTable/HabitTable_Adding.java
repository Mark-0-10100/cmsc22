package com.mainProjectPackage.rewardSystem.habitTable;

import com.mainProjectPackage.Templates.Template_ManipulateTable;

import java.util.Scanner;

import static com.mainProjectPackage.rewardSystem.habitTable.HabitTableMain.*;
import static com.mainProjectPackage.Templates.LinePrinting.printLineForNewPage;
import static com.mainProjectPackage.Templates.LinePrinting.printLineForUI;

/**
 * Extends from an abstract class (which is the base template) used when
 * elements are to be manipulated in a table.
 * For this class we are just adding a new element (habit) to the table
 *
 */
public class HabitTable_Adding extends Template_ManipulateTable {

    /**
     * Prints some text labels for the User Interface
     */
    @Override
    public void printTextLabels() {
        printLineForNewPage();
        System.out.println("Reward System -> Add Habit");
        printLineForUI();
        System.out.println("Add a Habit for you to accomplish and\nearn points");
        printLineForUI();
    }

    /**
     * Scan the user input and store it in a variable
     */
    @Override
    public void askUserForInput() {
        //Input For Habit Name
        System.out.print("[INPUT String]Add habit name: ");
        Scanner scanAddHabit_InTable= new Scanner(System.in);
        storeHabitDescription = scanAddHabit_InTable.nextLine();

        //Input For Reward
        System.out.print("[INPUT double]Add habit reward: ");
        Scanner scanAddReward_InTable= new Scanner(System.in);
        HabitTableMain.storeHabitReward = scanAddReward_InTable.nextDouble();

    }

    /**
     * Adds/append the user input in the table
     */
    @Override
    public void modifyElementInTable() {
            habitDescription.add(storeHabitDescription);
            habitReward.add(storeHabitReward);

    }
}

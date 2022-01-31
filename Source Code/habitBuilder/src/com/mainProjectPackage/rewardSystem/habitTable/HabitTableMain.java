package com.mainProjectPackage.rewardSystem.habitTable;

import java.util.ArrayList;

import static com.mainProjectPackage.Templates.LinePrinting.printLineForUI;

/**
 * This is a "Table" class for displaying the Habit Table,
 * this is where most of the content
 * printing happens (for the Table).
 *
 * The table works with the use of an array list
 */
public class HabitTableMain {
    //These are variables used in other classes (in this case the "element manipulation template")
    public static String storeHabitDescription=null;
    public static Double storeHabitReward;

    //Creates a list where Values are stored
    public static ArrayList<String> habitDescription = new ArrayList<String>();
    public static ArrayList<Double> habitReward = new ArrayList<Double>();

    //Reference number for deletion (used in "Deletion class")
    public static Integer storeDeletionReferenceNum;

    //Variable for accomplishing task
    public static Integer storeAccomplishedReferenceNum;

    /**
     * This method prints out the Habit Table
     *
     * contains a forloop that goes through an array list
     */
    public static void showHabitTable(){
        System.out.println("HABIT TABLE: \n");


        //Table Content -----------------------------------------------------------------
        //Prints each elements in the ArrayList
        if (storeHabitDescription==null){
            System.out.println("\n\n\t\t(No content yet)\n\n");
        }else{
            for (int i = 0; i < habitDescription.size(); i++) {
                System.out.print("("+(String.valueOf(i+1))+") [" + habitReward.get(i) + "] " + habitDescription.get(i) + "\n");
            }
        }
        //Table Content -----------------------------------------------------------------

        printLineForUI();
    }
}

package com.mainProjectPackage.rewardSystem.rewardMarketAndInventory;

import java.util.ArrayList;

import static com.mainProjectPackage.Templates.LinePrinting.printLineForUI;
/**
 * This is a "Table" class for displaying the Inventory Table,
 * this is where most of the content
 * printing happens (for the Inventory Table).
 *
 * The table works with the use of an array list
 */
public class InventoryTable {
    public static String storeInventoryItem = null;
    //Array list for storing the contents
    public static ArrayList<String> arraylistInventoryItem = new ArrayList<String>();

    //Variable for buying Reward Item
    public static Integer storeBuyItemReferenceNum_MarketPlace;

    //For using the item in the inventory
    public static Integer storeUseRewardItemInTableReferenceNum;

    /**
     * This method prints out the Habit Table
     *
     * contains a forloop that goes through an array list
     */
    public static void showInventoryTable(){
        System.out.println("\n");
        printLineForUI();
        System.out.println("REWARD ITEMS INVENTORY: ");
        printLineForUI();
        //Table Content -----------------------------------------------------------------
        //Prints each elements in the ArrayList
        if (storeInventoryItem == null) {
            System.out.println("\n\n\t\t(No content yet)");
        }else{//Prints the table
            for (int i = 0; i < arraylistInventoryItem.size(); i++) {
                System.out.print("("+(String.valueOf(i+1))+") " + arraylistInventoryItem.get(i) +"\n");
            }
        }
        //Table Content -----------------------------------------------------------------
        System.out.println("\n\n");

    }
}

package com.mainProjectPackage.rewardSystem.rewardMarketAndInventory;

import com.mainProjectPackage.Templates.Template_ManipulateTable;

import java.util.Scanner;


import static com.mainProjectPackage.Templates.LinePrinting.printLineForUI;
import static com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.InventoryTable.showInventoryTable;
/**
 * Extends from an abstract class (which is the base template) used when
 * elements are to be manipulated in a table.
 * For this class we are deleting an element since we are consuming the reward
 * we bought
 *
 */
public class InventoryTableOption_UseReward extends Template_ManipulateTable {
    /**
     * Prints some text labels for the User Interface
     */
    @Override
    public void printTextLabels() {
        showInventoryTable();
        System.out.println("Use reward item by entering the number that \n" +
                "corresponds to the reward item you want to use in your inventory");
        printLineForUI();
        System.out.print("[INPUT int] Enter num:");
    }


    /**
     * Scan the user input and store it in a variable
     */
    @Override
    public void askUserForInput() {

        Scanner scanUseRewardItemInTable= new Scanner(System.in);
        InventoryTable.storeUseRewardItemInTableReferenceNum = scanUseRewardItemInTable.nextInt(); //Variable for stored Category
    }

    /**
     * Removes the "used" reward item
     */
    @Override
    public void modifyElementInTable() {
        InventoryTable.arraylistInventoryItem.remove(InventoryTable.storeUseRewardItemInTableReferenceNum-1);
    }
}

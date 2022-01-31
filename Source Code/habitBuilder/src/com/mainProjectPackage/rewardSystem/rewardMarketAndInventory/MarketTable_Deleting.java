package com.mainProjectPackage.rewardSystem.rewardMarketAndInventory;

import com.mainProjectPackage.Templates.Template_ManipulateTable;

import java.util.Scanner;

import static com.mainProjectPackage.Templates.LinePrinting.printLineForUI;
import static com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.MarketTable.showMarketTable;
/**
 * Extends from an abstract class (which is the base template) used when
 * elements are to be manipulated in a table.
 * For this class we are just deleting an element (habit) to the table
 *
 */
public class MarketTable_Deleting extends Template_ManipulateTable {
    /**
     * Prints some text labels for the User Interface
     */
    @Override
    public void printTextLabels() {
        showMarketTable();
        System.out.println("Delete by entering the number that corresponds\n" +
                " to the habit you want to remove in the table");
        printLineForUI();
        System.out.print("[INPUT int] Enter num:");


    }

    /**
     * Scan the user input and store it in a variable
     */
    @Override
    public void askUserForInput() {
        //Scanners
        Scanner scanDeleteRewardItem_InTable= new Scanner(System.in);
        MarketTable.storeDeletionReferenceNum_MarketPlace = scanDeleteRewardItem_InTable.nextInt(); //Variable for stored Category


    }

    /**
     * Deletes the specified element by the user
     */
    @Override
    public void modifyElementInTable() {
        MarketTable.arraylistRewardItemName.remove(MarketTable.storeDeletionReferenceNum_MarketPlace-1);
        MarketTable.arraylistRewardItemCost.remove(MarketTable.storeDeletionReferenceNum_MarketPlace-1);

    }
}

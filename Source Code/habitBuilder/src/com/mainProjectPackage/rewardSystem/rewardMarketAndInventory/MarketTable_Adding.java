package com.mainProjectPackage.rewardSystem.rewardMarketAndInventory;

import com.mainProjectPackage.Templates.Template_ManipulateTable;

import java.util.Scanner;

import static com.mainProjectPackage.Templates.LinePrinting.printLineForNewPage;
import static com.mainProjectPackage.Templates.LinePrinting.printLineForUI;
import static com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.MarketTable.*;
/**
 * Extends from an abstract class (which is the base template) used when
 * elements are to be manipulated in a table.
 * For this class we are just adding a new element (habit) to the table
 *
 */
public class MarketTable_Adding extends Template_ManipulateTable {
    /**
     * Prints some text labels for the User Interface
     */
    @Override
    public void printTextLabels() {
        printLineForNewPage();
        System.out.println("Add a reward item that you can buy with your points");
        printLineForUI();
    }

    /**
     * Scan the user input and store it in a variable
     */
    @Override
    public void askUserForInput() {
        System.out.print("[INPUT String]Add reward name: ");

        //Scanners
        Scanner scanAddRewardItem_InTable= new Scanner(System.in);
        storeRewardItemName = scanAddRewardItem_InTable.nextLine();

        //For Cost
        System.out.print("[INPUT double]Add reward item cost: ");

        //Scanners
        Scanner scanAddRewardItemCost_InTable= new Scanner(System.in);
        MarketTable.storeRewardItemCost = scanAddRewardItemCost_InTable.nextDouble();

    }

    /**
     * Adds/append the user input in the table
     */
    @Override
    public void modifyElementInTable() {
        arraylistRewardItemName.add(storeRewardItemName);
        arraylistRewardItemCost.add(storeRewardItemCost);
    }

}

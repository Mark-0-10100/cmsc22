package com.mainProjectPackage.rewardSystem.rewardMarketAndInventory;

import com.mainProjectPackage.Templates.PageFactory;

import static com.mainProjectPackage.Templates.LinePrinting.*;
import static com.mainProjectPackage.Templates.ScanUserOption.askUserOption;
import static com.mainProjectPackage.Templates.UserOptionPrinting.printMarketAndInvent_UserOptions;
import static com.mainProjectPackage.rewardSystem.RewardSystemMainPage.balance_text;
import static com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.InventoryTable.showInventoryTable;
import static com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.MarketTable.showMarketTable;
/**
 * This class contains the Marketplace and Inventory page,
 * this is where most of the printing and method calls happen
 * for the Marketplace and Inventory page
 *
 */
public class RewardMarketAndInventoryMainPage {
    /**
     * A method that is called in order to display the "Marketplace and Inventory page"
     */
    public static void showMarketAndInventoryPage(){
        //This is for printing out the title and the balance
        printLineForNewPage();
        printTopBotLines();
        System.out.println("Reward System> Marketplace and Inventory");    //Title
        printLineForUI();
        System.out.println(balance_text);
        printLineForUI();

        //This is for printing the table for Marketplace
        showMarketTable();

        //This is for printing the table for Inventory
        showInventoryTable();
        printTopBotLines();

        //This is for printing out the UserOptions
        printMarketAndInvent_UserOptions();

        //This is for asking UserInput for User Option
        Integer chosenUserOption = askUserOption();
        PageFactory.makePageRewardMarketInventory(chosenUserOption);
    }
}

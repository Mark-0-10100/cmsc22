package com.mainProjectPackage.rewardSystem.rewardMarketAndInventory;

import com.mainProjectPackage.Templates.Template_ManipulateTable;
import com.mainProjectPackage.rewardSystem.RewardSystemMainPage;

import java.util.Scanner;

import static com.mainProjectPackage.Templates.LinePrinting.printLineForNewPage;
import static com.mainProjectPackage.Templates.LinePrinting.printLineForUI;
import static com.mainProjectPackage.rewardSystem.RewardSystemMainPage.balanceNum;
import static com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.InventoryTable.arraylistInventoryItem;
import static com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.MarketTable.showMarketTable;
/**
 * Extends from an abstract class (which is the base template) used when
 * elements are to be manipulated in a table.
 * For this class we are just taking the data from the element in the table (reward cost)
 * so that we can deduct it to the user's balance
 */
public class MarketTableOption_BuyReward extends Template_ManipulateTable {

    /**
     * Prints some text labels for the User Interface
     */
    @Override
    public void printTextLabels() {
        printLineForNewPage();
        System.out.println("Reward System> Market Place> Buy reward item");
        printLineForUI();
        showMarketTable();
        System.out.println("Enter the number that corresponds to the reward\n you desire to buy");
        printLineForUI();
        System.out.print("[INPUT int] Enter num:");

    }

    /**
     * Scan the user input and store it in a variable
     */
    @Override
    public void askUserForInput() {
        Scanner scanBuy_InMarketTable = new Scanner(System.in);
        InventoryTable.storeBuyItemReferenceNum_MarketPlace = scanBuy_InMarketTable.nextInt(); //Variable for stored Category

    }

    /**
     * Takes the "reward item cost" data to subtract to the user's balance,
     * then updates the "Inventory Table"
     */
    @Override
    public void modifyElementInTable() {

        //Subtracts balance since user bought a Reward Item
        double correspondingCost = MarketTable.arraylistRewardItemCost.get(InventoryTable.storeBuyItemReferenceNum_MarketPlace -1);
        balanceNum -= correspondingCost;
        RewardSystemMainPage.balance_text = "Balance: " + String.valueOf(balanceNum) + " Habit points";


        //Updates the inventory
        InventoryTable.storeInventoryItem = MarketTable.arraylistRewardItemName.get(InventoryTable.storeBuyItemReferenceNum_MarketPlace -1);
        String boughtItemFromMarket = InventoryTable.storeInventoryItem;
        arraylistInventoryItem.add(boughtItemFromMarket);

    }
}

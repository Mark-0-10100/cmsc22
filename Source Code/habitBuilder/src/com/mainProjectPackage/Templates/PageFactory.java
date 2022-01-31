package com.mainProjectPackage.Templates;

import com.mainProjectPackage.rewardSystem.habitTable.HabitTable_AccomplishHabit;
import com.mainProjectPackage.rewardSystem.habitTable.HabitTable_Adding;
import com.mainProjectPackage.rewardSystem.habitTable.HabitTable_Deleting;
import com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.InventoryTableOption_UseReward;
import com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.MarketTableOption_BuyReward;
import com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.MarketTable_Adding;
import com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.MarketTable_Deleting;

import static com.mainProjectPackage.HomePage.showHomePage;
import static com.mainProjectPackage.rewardSystem.RewardSystemMainPage.showRewardSystemMainPage;

import static com.mainProjectPackage.rewardSystem.rewardMarketAndInventory.RewardMarketAndInventoryMainPage.showMarketAndInventoryPage;

/**
 * This class contains the factory methods
 * which is responsible for creating new pages
 *
 */
public class PageFactory {

    /**
     * This method creates different pages depending on the userInput
     * in the Reward System Page
     *
     * @param userOption can hold numbers 1 up to 5, each of which
     *                   is associated with the creation of
     *                   a certain page
     */
    public static Template_ManipulateTable makePageRewardSystem(int userOption){

            //Displays Adding Page Option
        if (userOption == 1) {
            Template_ManipulateTable addElements = new HabitTable_Adding();
            addElements.manipulateElementsInTable();
            showRewardSystemMainPage();

            //Displays Deleting Page Option
        } else if (userOption == 2) {
            Template_ManipulateTable deleteElements = new HabitTable_Deleting();
            deleteElements.manipulateElementsInTable();
            showRewardSystemMainPage();

            //Opens Accomplish Page Option
        } else if (userOption == 3) {
            Template_ManipulateTable accomplishHabit = new HabitTable_AccomplishHabit();
            accomplishHabit.manipulateElementsInTable();
            showRewardSystemMainPage();

            //Displays the Market and Inventory Page
        } else if (userOption == 4) {
            showMarketAndInventoryPage();

            //Goes Back to the Home Page
        } else if (userOption == 5) {
            showHomePage();
        }
        return null;
    }

    /**
     * This method creates different pages depending on the userInput
     * in the Reward Market and Inventory Page
     *
     * @param userOption can hold numbers 1 up to 5, each of which
     *                   is associated with the creation of
     *                   a certain page
     */
    public static Template_ManipulateTable makePageRewardMarketInventory(int userOption){
        // Displays add Reward Items Page
        if (userOption==1){
            Template_ManipulateTable addElements = new MarketTable_Adding();
            addElements.manipulateElementsInTable();
            showMarketAndInventoryPage();

        }

        // Displays delete Reward Items Page
        else if (userOption==2){
            Template_ManipulateTable deleteElements = new MarketTable_Deleting();
            deleteElements.manipulateElementsInTable();
            showMarketAndInventoryPage();
        }

        // Displays buy Reward Items Page
        else if (userOption==3){
            Template_ManipulateTable buyRewardItem = new MarketTableOption_BuyReward();
            buyRewardItem.manipulateElementsInTable();
            showMarketAndInventoryPage();
        }

        // Displays use Reward Items Page
        else if (userOption==4){
            Template_ManipulateTable useRewardItem = new InventoryTableOption_UseReward();
            useRewardItem.manipulateElementsInTable();
            showMarketAndInventoryPage();
        }

        // Goes back to the main Reward System Main Page
        else if (userOption==5){
            showRewardSystemMainPage();
        }
        return null;
    }
}

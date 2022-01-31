package com.mainProjectPackage.rewardSystem.rewardMarketAndInventory;

import java.util.ArrayList;

/**
 * This is a "Table" class for displaying the Market Table,
 * this is where most of the content
 * printing happens (for the Market Table).
 *
 * The table works with the use of an array list
 */
public class MarketTable {
    //These are variables used in other classes (in this case the "element manipulation template")
    public static String storeRewardItemName=null;
    public static Double storeRewardItemCost;


    public static ArrayList<String> arraylistRewardItemName = new ArrayList<String>();
    public static ArrayList<Double> arraylistRewardItemCost= new ArrayList<Double>();

    //Fields for deletion
    public static Integer storeDeletionReferenceNum_MarketPlace;


    /**
     * This method prints out the Market Place Table
     * where users can list or buy the leisure activity they can afford
     *
     * contains a forloop that goes through an array list
     */
    public static void showMarketTable(){


        System.out.println("MARKET PLACE TABLE: \n");

        //Table Content -----------------------------------------------------------------
        //Prints each elements in the ArrayList
        if (storeRewardItemName==null){
            System.out.println("\n\n\t\t(No content yet)");
        }else{
            for (int i = 0; i < arraylistRewardItemName.size(); i++) {
                System.out.print("("+(String.valueOf(i+1))+") [" + arraylistRewardItemCost.get(i) + "] " + arraylistRewardItemName.get(i) + "\n");
            }
        }
        //Table Content -----------------------------------------------------------------


    }
}

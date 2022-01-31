package com.mainProjectPackage.Templates;

/**
 * The purpose of this class is to contain methods
 * which prints out lines that help make the page display clean
 */

public class LinePrinting {

    /**
     * Prints the top or bottom line divider to improve
     * readablity of User Interface
     */
    public static void printTopBotLines(){
        System.out.println("+---------------------------------------------+");
    }
    /**
     * Prints line dividers present in each page to improve
     * readablity of User Interface
     */
    public static void printLineForUI(){
        System.out.println("-----------------------------------------------");
    }

    /**
     * This method is called when a new page must be displayed
     * it prints out 20 new blank lines as another way of
     * signifying that a new page is displayed
     */
    public static void printLineForNewPage(){
        for(int i=0; i!=20; i++)
        System.out.println("\n");
    }

}

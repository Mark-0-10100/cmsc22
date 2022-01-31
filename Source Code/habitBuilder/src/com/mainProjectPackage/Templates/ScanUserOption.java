package com.mainProjectPackage.Templates;

import java.util.Scanner;

/**
 * The purpose of this class is to scan for user input
 * this class is frequently used for User Options Scanning
 */
public class ScanUserOption {

    /**
     * The method scans for an integer for User Options,
     * frequently used in Navigating
     *
     * @return an integer that corresponds to a user option
     */
    public static Integer askUserOption(){
        System.out.print("\n[INPUT]Select your option: ");

        //Scanners
        Scanner scanUserOption = new Scanner(System.in);
        return scanUserOption .nextInt(); //Variable for stored Category
    }
}

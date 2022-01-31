package com.mainProjectPackage.Templates;
/**
 * This is an abstract class which serves as the base template
 * whenever we need to manipulate elements in tables.
 */
public abstract class Template_ManipulateTable {
    public abstract void printTextLabels();
    public abstract void askUserForInput();
    public abstract void modifyElementInTable();

    /**
     * Executes method which prints some texts
     * then asks for some user input,
     * and then modifies the elements in the table
     *
     */
    public final void manipulateElementsInTable(){
        printTextLabels();
        askUserForInput();
        modifyElementInTable();
    }
}

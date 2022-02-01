package com.mainProjectPackage;


import com.mainProjectPackage.rewardSystem.habitTable.HabitTable_AccomplishHabit_DEMO;
import com.mainProjectPackage.rewardSystem.habitTable.HabitTable_Adding;
import com.mainProjectPackage.rewardSystem.habitTable.HabitTable_Adding_DEMO;
import com.mainProjectPackage.rewardSystem.habitTable.HabitTable_Deleting_DEMO;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.mainProjectPackage.rewardSystem.RewardSystemMainPage.balanceNum;
import static com.mainProjectPackage.rewardSystem.habitTable.HabitTableMain.habitDescription;
import static com.mainProjectPackage.rewardSystem.habitTable.HabitTableMain.habitReward;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class testing {
    //Adding and deleting will use this list
    ArrayList<String> expected_habitDescription = new ArrayList<String>();
    ArrayList<Double> expected_habitReward = new ArrayList<Double>();

    @Test
    public void shouldAddToList(){
        //Instantiate an object for a class
        HabitTable_Adding_DEMO habitTable_test = new HabitTable_Adding_DEMO();

        //Expected List

        expected_habitDescription.add("study");
        expected_habitReward.add(500.00);

        //Method in the class
        HabitTable_Adding_DEMO.addElement("study", 500.00);

        //Test if element is added
        assertEquals(expected_habitDescription, habitDescription);
        assertEquals(expected_habitReward , habitReward);

    }

    @Test
    public void shouldDeleteInList(){

        //Instantiate an object for a class
        HabitTable_Deleting_DEMO habitTable_test = new HabitTable_Deleting_DEMO();

        //Expected List
            //List should be empty since we deleted all the elements
        ArrayList<String> expectedList_afterDelete = new ArrayList<String>();

        //Method in the class
        HabitTable_Deleting_DEMO.deleteElement();

        //Test if element is deleted
        assertEquals(expectedList_afterDelete, habitDescription);
        assertEquals(expectedList_afterDelete, habitReward);
    }


    @Test
    public void shouldAccomplish(){
        //Instantiate an object for a class
        HabitTable_AccomplishHabit_DEMO habitTable_test = new HabitTable_AccomplishHabit_DEMO();

        //Expected Value
        double expectedBalance = 500.00;

        //This class needs a list, list for this testing scenario:
        habitDescription.add("Jog");
        habitReward.add(500.00);

        //Method in the class
        HabitTable_AccomplishHabit_DEMO.accomplishHabit();

        //Test value
        assertEquals(expectedBalance, balanceNum);
    }
}

package com.itexps.basictutorials.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akshaykumar Patel on 6/11/2017.
 * E-mail on akshayhp@outlook.com
 */

public class DataProvider {

    public static ArrayList<TutorialIndexItem> getTutorialIndexData()
    {
        ArrayList<TutorialIndexItem> items=new ArrayList<>();

        //add data
        TutorialIndexItem indexItem=new TutorialIndexItem("Button & Toast","This is basic example of handling button click & display a toast message.");
        items.add(indexItem);

        indexItem=new TutorialIndexItem("Getting input from user","This is basic example of getting input from user & display in toast message.");
        items.add(indexItem);

        indexItem=new TutorialIndexItem("Activity transition","This is example of intent &  sending data to another activity");
        items.add(indexItem);


        indexItem=new TutorialIndexItem("Basic form controls & inputs","This is example of getting different types of controls & inputs from user");
        items.add(indexItem);

        return items;
    }
}

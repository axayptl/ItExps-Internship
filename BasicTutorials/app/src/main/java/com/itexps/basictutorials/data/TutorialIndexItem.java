package com.itexps.basictutorials.data;

/**
 * Created by Akshaykumar Patel on 6/11/2017.
 * E-mail on akshayhp@outlook.com
 */

public class TutorialIndexItem {
    private String title;
    private String description;

    public TutorialIndexItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

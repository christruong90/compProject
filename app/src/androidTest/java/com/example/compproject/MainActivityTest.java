package com.example.compproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private String enteredTask = "new task entered!!!";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUserInputScenario() {
        // task entered
        Espresso.onView(withId(R.id.editTextTask)).perform(typeText(enteredTask));
        // close softkeyboard
        Espresso.closeSoftKeyboard();
        // button click
        Espresso.onView(withId(R.id.buttonAddTask)).perform(click());
        
    }


    @After
    public void tearDown() throws Exception {
    }
}
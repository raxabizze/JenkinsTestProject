package com.example.raxabizze.test;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    private  MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity = mActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void tearLaunch() {
    }


    @Test
    public void testFirstBranch(){
        String first = mainActivity.firstBranch("A部門,B課,C小組");
        Assert.assertEquals("A部門", first);
    }

    @Test
    public void testLastBranch(){
        String last = mainActivity.lastBranch("A部門,B課,C小組");
        Assert.assertEquals("CC小組", last);
    }
}
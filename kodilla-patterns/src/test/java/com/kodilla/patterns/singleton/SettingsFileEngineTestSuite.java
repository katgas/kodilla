package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileEngineTestSuite {
    private static SettingsFileEngine settingsFileEngine;

    @BeforeClass
    public static void openSettingsFile() {
        settingsFileEngine.getInstance().open("myapp.settings");
    }
    @AfterClass
    public static void closeSettingsFile() {
        settingsFileEngine.getInstance().close();
    }
    @Test
    public void testGetFileName() {
        //given
        //when
        String fileName = settingsFileEngine.getInstance().getFileName();
        System.out.println("Opened: " + fileName);
        //then
        Assert.assertEquals("myapp.settings", fileName);
    }
    @Test
    public void testLoadSettings() {
        //given
        //when
        boolean result = settingsFileEngine.getInstance().loadSettings();
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void testSaveSettings() {
        //given
        //when
        boolean result = settingsFileEngine.getInstance().saveSettings();
        //then
        Assert.assertTrue(result);
    }
}

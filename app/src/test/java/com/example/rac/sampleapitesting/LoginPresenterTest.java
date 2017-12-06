package com.example.rac.sampleapitesting;

import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginPresenterTest {

    public static String TAG  = "LOGINPRESENTERTEST";
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 - 2);
    }

    @Test
    public void substraction() throws Exception
    {
        assertEquals("EXPECTED 4",4,5 );
    }
}
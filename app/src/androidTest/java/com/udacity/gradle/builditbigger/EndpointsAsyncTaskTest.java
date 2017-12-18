package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static android.support.test.InstrumentationRegistry.getContext;
import static android.support.test.InstrumentationRegistry.getTargetContext;
import static org.junit.Assert.*;

/**
 * Created by Mohamed Elsayed on 12/18/2017.
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testDataHasComeAndNotEmpty() {
        Context context = getTargetContext();
        EndpointsAsyncTask mendPoint = new EndpointsAsyncTask();
        mendPoint.execute(context);
        String joke = "";
        try {
            joke = mendPoint.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull("The Joke Was null",joke);
        assertNotEquals("The Joke was empty", "", joke);
    }
}
package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.text.TextUtils.isEmpty;
import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyReturnOfNonEmptyString() {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(null);
        endpointsAsyncTask.execute((new Pair<Context, String>(null, "Manfred")));

        String result = null;
        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(result, !isEmpty(result));
    }
}
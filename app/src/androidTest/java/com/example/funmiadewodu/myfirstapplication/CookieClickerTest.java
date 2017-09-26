package com.example.funmiadewodu.myfirstapplication;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by funmiadewodu on 26/09/2017.
 */

@RunWith(AndroidJUnit4.class)

public class CookieClickerTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void totalStartsAtZero() throws Exception {
        onView(withId(R.id.lblTotal))
            .check(matches(withText("0")));
    }

    @Test
    public void totalIncreaseWhenIncreaseButtonClicked() throws Exception {
        onView(withId(R.id.increase_button_id))
                .perform(click());
        onView(withId(R.id.lblTotal))
                .check(matches(withText("1")));
    }

    @Test
    public void totalReducesWhenReduceButtonClicked() throws Exception {
        onView(withId(R.id.decrease_button_id))
                .perform(click());
        onView(withId(R.id.lblTotal))
                .check(matches(withText("-1")));
    }
}

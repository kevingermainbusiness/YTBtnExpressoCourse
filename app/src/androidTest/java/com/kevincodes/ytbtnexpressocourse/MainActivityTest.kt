package com.kevincodes.ytbtnexpressocourse

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var activityScenario = activityScenarioRule<MainActivity>()

    @Before
    fun setUp() {

        val scenario = launchActivity<MainActivity>()
    }

    @Test
    fun display_text_changes_on_btn_click() {
        onView(withId(R.id.btn)).perform(click())

        onView(withId(R.id.tvDisplayText))
            .check(matches(withText("Hello Espresso!")))

        // or you could also check for any views
        // with the term "Hello Espresso!"
        // like so

//        onView(withText("Hello Espresso!")).check(matches(isDisplayed()))
    }
}
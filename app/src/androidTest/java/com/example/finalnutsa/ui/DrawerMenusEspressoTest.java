package com.example.finalnutsa.ui;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import it.feio.android.omninotes.R;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class DrawerMenusEspressoTest extends BaseEspressoTest {

  @Test
  public void mainMenuLoaded() {
    openDrawer();

    onView(allOf(withId(R.id.title), withText(R.string.title_item_list)))
        .check(matches(isDisplayed()));
  }

  @Test
  public void categoriesMenuLoaded() {
    String categoryName = "test category";
    createCategory(categoryName);

    openDrawer();

    onView(allOf(withId(R.id.title), withText(categoryName)))
        .check(matches(isDisplayed()));
  }

}

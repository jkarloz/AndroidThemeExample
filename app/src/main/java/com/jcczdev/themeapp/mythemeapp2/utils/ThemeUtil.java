package com.jcczdev.themeapp.mythemeapp2.utils;

import android.app.Activity;
import android.content.Intent;

import com.jcczdev.themeapp.mythemeapp2.R;

/**
 * Created by Juan on 4/03/2018.
 */

public class ThemeUtil {
    private static int cTheme;
    public final static int BLACK = 0;
    public final static int BLUE = 1;

    public static void changeToTheme(Activity activity, int theme)
    {
        cTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (cTheme)
        {
            default:
            case BLACK:
                activity.setTheme(R.style.BlackTheme);
                break;
            case BLUE:
                activity.setTheme(R.style.BlueTheme);
                break;
        }

    }
}

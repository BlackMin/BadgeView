package com.baymax.android.badgeview.utils;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;

public class UIUtils {

    public static int dip2Px(int dp) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return (int) (displayMetrics.density * dp);
    }
}

package com.zephyr.task2.Utilities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {

    private SharedPreferences preferences;
    private final SharedPreferences.Editor editor;
    private static final String PREF_NAME = "com.applex.zephyr_task_2";
    private static final String ORDER_BY = "order_by";

    @SuppressLint("CommitPrefEdits")
    public PreferenceManager(Context context) {
        if(context != null) {
            preferences = context.getSharedPreferences(PREF_NAME, 0);
        }
        editor = preferences.edit();
    }

    public void setSortOrder(int order) {
        editor.putInt(ORDER_BY, order);
        editor.apply();
    }

    public int getSortOrder() { return preferences.getInt(ORDER_BY, 0); }
}
package com.baymax.android.badgeview.samples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baymax.android.badgeview.BadgeLayout;
import com.baymax.android.badgeview.BadgeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BadgeLayout badgeLayout = findViewById(R.id.badge_layout);
        badgeLayout.setBadgeType(BadgeView.BadgeType.NUMBERS);
        badgeLayout.setBadgeText(99+"");
    }
}

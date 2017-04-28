package com.doctor.warplinelayout;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WarpLinearLayout mWarpLinearLayout;
    private LayoutInflater mInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWarpLinearLayout = (WarpLinearLayout) findViewById(R.id.myview);
        mInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        String[] str = {"231", "dasda", "dsds", "gfdgfdg", "32r32r"
                , "dasda", "dsds", "gfdgfdg", "32r32r"
                , "dasda", "dsds", "gfdgfdg", "32r32r"};

        for (int i = 0; i < str.length; i++) {
            LinearLayout itemLayout = (LinearLayout) mInflater.inflate(R.layout.layout_item, mWarpLinearLayout, false);
            TextView textView = (TextView) itemLayout.findViewById(R.id.name);
            textView.setText(str[i]);
            mWarpLinearLayout.addView(itemLayout);

        }
    }
}

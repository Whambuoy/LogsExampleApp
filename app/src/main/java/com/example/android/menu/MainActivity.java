package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView firstItem = (TextView)findViewById(R.id.menu_item_1);
        String message1 = (String) firstItem.getText();
        Log.i("Menu 1", message1);

        // Find second menu item TextView and print the text to the logs
        TextView secondItem = (TextView) findViewById(R.id.menu_item_2);
        String message2 = (String) secondItem.getText();
        Log.i("Menu 2", message2);
        // Find third menu item TextView and print the text to the logs
        TextView thirdItem = (TextView) findViewById(R.id.menu_item_3);
        String message3 = (String) thirdItem.getText();
        Log.i("Menu 3", message3);
    }
}
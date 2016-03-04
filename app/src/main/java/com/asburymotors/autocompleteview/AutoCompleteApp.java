package com.asburymotors.autocompleteview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteApp extends Activity {

        @Override
        public void onCreate (Bundle savedInstanceState){
            String[] products = {"Camera", "Handi Cam", "Cell Phone", "Laptop", "Car"};
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_auto_complete_app);
            ArrayAdapter<String> arrayAdapt = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, products);
            AutoCompleteTextView productNames = (AutoCompleteTextView) findViewById(R.id.product_names);
            productNames.setThreshold(1);
            productNames.setAdapter(arrayAdapt);
        }
    }

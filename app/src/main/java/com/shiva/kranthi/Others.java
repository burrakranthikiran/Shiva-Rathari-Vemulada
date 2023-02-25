package com.shiva.kranthi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Others extends AppCompatActivity {

    CardView ptrk_1, atm_1;
    ImageView iv_back_app_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
        ptrk_1 = findViewById(R.id.ptrk_1);
        atm_1 = findViewById(R.id.atm_1);
        iv_back_app_info = findViewById(R.id.iv_back_app_info);

        iv_back_app_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ptrk_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchKey = "Near by petrol bunk";
                Intent search = new Intent(Intent.ACTION_WEB_SEARCH);
                search.putExtra(SearchManager.QUERY, searchKey);
                startActivity(search);
            }
        });

        atm_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchKey = "Near by atm";
                Intent search = new Intent(Intent.ACTION_WEB_SEARCH);
                search.putExtra(SearchManager.QUERY, searchKey);
                startActivity(search);
            }
        });

    }
}
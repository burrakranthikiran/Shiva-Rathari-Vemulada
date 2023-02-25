package com.shiva.kranthi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class EmgNumber extends AppCompatActivity {

    LinearLayout one_cp,two_cp,three_cp,four_cp,five_cp,six_cp,seven_cp,eight_cp,nine_cp;
    ImageView iv_back_app_info;
    ClipboardManager clipboardManager;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emg_number);
        one_cp = findViewById(R.id.one_cp);
        two_cp = findViewById(R.id.two_cp);
        three_cp = findViewById(R.id.three_cp);
        four_cp = findViewById(R.id.four_cp);
        five_cp = findViewById(R.id.five_cp);
        six_cp = findViewById(R.id.six_cp);
        seven_cp = findViewById(R.id.seven_cp);
        eight_cp = findViewById(R.id.eight_cp);
        nine_cp = findViewById(R.id.nine_cp);
        four_cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("key", "7337234446");
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        five_cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("key", "8712656413");
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        six_cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("key", "9440078901");
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        seven_cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("key", "8008578959");
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        eight_cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("key", "08723238101");
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        nine_cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("key", "18004252038");
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        iv_back_app_info = findViewById(R.id.iv_back_app_info);
        iv_back_app_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        one_cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("key", "6281844309");
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        two_cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("key", "8712656412");
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        three_cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("key", "9491000743");
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
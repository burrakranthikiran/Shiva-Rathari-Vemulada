package com.shiva.kranthi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.joanzapata.pdfview.PDFView;

public class TemplePfd extends AppCompatActivity {
    PDFView mPDFView;
    ImageView iv_back_app_info_k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_temple_pfd);
        iv_back_app_info_k = findViewById(R.id.iv_back_app_info);
        iv_back_app_info_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mPDFView = (PDFView) findViewById(R.id.pdfView);
        mPDFView.fromAsset("Information_temple.pdf").load();
    }
}
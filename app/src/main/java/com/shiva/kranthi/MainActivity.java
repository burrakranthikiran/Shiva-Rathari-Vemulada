package com.shiva.kranthi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    Adapter adapter;
//    FirebaseDatabase firebaseDatabase;
//    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new CountDownTimer(2000, 1000) {
            public void onTick(long millisUntilFinished) {
                setContentView(R.layout.splash_screen);
            }

            public void onFinish() {
                setContentView(R.layout.activity_main);

                dataList = findViewById(R.id.dataList);

                titles = new ArrayList<>();
                images = new ArrayList<>();

                titles.add("About Temple");
                titles.add("Tourist Places");
                titles.add("Cultural Activities");
                titles.add("Emergency");
                titles.add("Public Amenities");
                titles.add("Others");
                titles.add("How to Reach Temple");
                titles.add("Temple Donation");
//                titles.add("App Info");
                titles.add("FAQ's");

                    images.add(R.drawable.about_temple);
                images.add(R.drawable.tr);
                images.add(R.drawable.culture);
                images.add(R.drawable.eng_tm);
                images.add(R.drawable.mp_1);
                images.add(R.drawable.ic_baseline_wb_iridescent_24);
                images.add(R.drawable.map);
                images.add(R.drawable.donation);
//                images.add(R.drawable.baseline_info_24);
                images.add(R.drawable.faqs);
                adapter = new Adapter(getApplicationContext(),titles,images);

                GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2,GridLayoutManager.VERTICAL,false);
                dataList.setLayoutManager(gridLayoutManager);
                dataList.setAdapter(adapter);
            }
        }.start();














    }
}
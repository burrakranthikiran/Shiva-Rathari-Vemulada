package com.shiva.kranthi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Faqs extends AppCompatActivity {

    LinearLayout hello, world, two_q,two_a, three_q,three_a,four_q,four_a,five_q,five_a,six_q,six_a,seven_q,seven_a,eight_q,eight_a,nine_q,nine_a,ten_q,ten_a,eleven_q,eleven_a,twelve_q,twelve_a,thirteen_q,thirteen_a,fourteen_q,fourteen_a;
    ImageView iv_back_app_info;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
        hello = findViewById(R.id.hello);
        world = findViewById(R.id.world);
        two_q = findViewById(R.id.two_q);
        two_a = findViewById(R.id.two_a);
        three_q = findViewById(R.id.three_q);
        three_a = findViewById(R.id.three_a);
        four_q = findViewById(R.id.four_q);
        four_a = findViewById(R.id.four_a);
        five_q = findViewById(R.id.five_q);
        five_a = findViewById(R.id.five_a);
        six_q = findViewById(R.id.six_q);
        six_a = findViewById(R.id.six_a);
        seven_q = findViewById(R.id.seven_q);
        seven_a = findViewById(R.id.seven_a);
        eight_q = findViewById(R.id.eight_q);
        eight_a = findViewById(R.id.eight_a);
        nine_q = findViewById(R.id.nine_q);
        nine_a = findViewById(R.id.nine_a);
        ten_q = findViewById(R.id.ten_q);
        ten_a = findViewById(R.id.ten_a);
        eleven_q = findViewById(R.id.eleven_q);
        eleven_a = findViewById(R.id.eleven_a);
        twelve_q = findViewById(R.id.twelve_q);
        twelve_a = findViewById(R.id.twelve_a);
        thirteen_q = findViewById(R.id.thirteen_q);
        thirteen_a = findViewById(R.id.thirteen_a);
        fourteen_q = findViewById(R.id.fourteen_q);
        fourteen_a = findViewById(R.id.fourteen_a);
        iv_back_app_info = findViewById(R.id.iv_back_app_info);
        iv_back_app_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                world.setVisibility(View.VISIBLE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });

        two_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                two_a.setVisibility(View.VISIBLE);
                world.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });
        three_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                three_a.setVisibility(View.VISIBLE);
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });
        four_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four_a.setVisibility(View.VISIBLE);
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });

        five_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.VISIBLE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });

        six_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.VISIBLE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });

        seven_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.VISIBLE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });

        eight_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.VISIBLE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });

        nine_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.VISIBLE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });

        ten_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.VISIBLE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });
        eleven_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.VISIBLE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });
        twelve_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.VISIBLE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.GONE);
            }
        });
        thirteen_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.VISIBLE);
                fourteen_a.setVisibility(View.GONE);
            }
        });
        fourteen_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                world.setVisibility(View.GONE);
                two_a.setVisibility(View.GONE);
                three_a.setVisibility(View.GONE);
                four_a.setVisibility(View.GONE);
                five_a.setVisibility(View.GONE);
                six_a.setVisibility(View.GONE);
                seven_a.setVisibility(View.GONE);
                eight_a.setVisibility(View.GONE);
                nine_a.setVisibility(View.GONE);
                ten_a.setVisibility(View.GONE);
                eleven_a.setVisibility(View.GONE);
                twelve_a.setVisibility(View.GONE);
                thirteen_a.setVisibility(View.GONE);
                fourteen_a.setVisibility(View.VISIBLE);
            }
        });


    }
}
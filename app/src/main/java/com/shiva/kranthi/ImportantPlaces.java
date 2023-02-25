package com.shiva.kranthi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ImportantPlaces extends AppCompatActivity {

    ImageView iv_back_app_info;
    CardView parking,busstop,toilets;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_places);
        iv_back_app_info = findViewById(R.id.iv_back_app_info);
        parking = findViewById(R.id.parking);
        busstop = findViewById(R.id.busstop);
        toilets = findViewById(R.id.toilets);

        toilets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(ImportantPlaces.this);
                dialog.setContentView(R.layout.toilets);
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialog.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

                dialog.getWindow().setAttributes(lp);

                TextView notification_title = dialog.findViewById(R.id.notification_box_title);
                LinearLayout dw1 = dialog.findViewById(R.id.dw1);
                LinearLayout dw2 = dialog.findViewById(R.id.dw2);
                LinearLayout dw3 = dialog.findViewById(R.id.dw3);
                LinearLayout dw4 = dialog.findViewById(R.id.dw4);
                Button Notification_Button_cancel = (Button) dialog.findViewById(R.id.notification_ButtonCancel);


                Notification_Button_cancel.setText("Cancel");
                notification_title.setText("Toilets List");

                dw1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4679615 + "," + 78.869875 ;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });

                dw2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4695348 + "," + 78.8679954 ;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });
                dw3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4700117 + "," + 78.870825 ;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });
                dw4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4691053 + "," + 78.8677216 ;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });



                // On click Cancel
                Notification_Button_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();



            }
        });


        iv_back_app_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        parking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4694861 + "," + 78.8701306 ;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        busstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4615114 + "," + 78.8676348 ;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
}
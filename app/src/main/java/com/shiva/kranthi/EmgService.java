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
import android.widget.TextView;

public class EmgService extends AppCompatActivity {
    ImageView iv_back_app_info_k;
    CardView contname,control_centre,hospital;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emg_service);
        iv_back_app_info_k = findViewById(R.id.iv_back_app_info);
        control_centre = findViewById(R.id.control_centre);
        hospital = findViewById(R.id.hospital);
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4695802 + "," + 78.867402 ;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        control_centre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(EmgService.this);
                dialog.setContentView(R.layout.notification_dialog_box);
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialog.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
                dialog.getWindow().setAttributes(lp);

                TextView notification_title = dialog.findViewById(R.id.notification_box_title);
                ImageView notification_image = dialog.findViewById(R.id.image);
//                TextView notification_message = dialog.findViewById(R.id.notification_box_message);

                Button Notification_Button_ok = (Button) dialog.findViewById(R.id.notification_ButtonOK);
                Button Notification_Button_cancel = (Button) dialog.findViewById(R.id.notification_ButtonCancel);

                Notification_Button_ok.setText("View Info");
                Notification_Button_cancel.setText("Navigate");

                // Setting up the notification dialog
                notification_title.setText("Control Centre");
                notification_image.setImageResource(R.drawable.enqry);
//                notification_image.setVisibility(View.INVISIBLE);
//                notification_message.setText("Please choose the option");

                // On click on Continue
                Notification_Button_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(EmgService.this, ControlRoom.class);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });
                // On click Cancel
                Notification_Button_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4671403 + "," + 78.871026 ;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });

                dialog.show();

            }
        });
        contname = findViewById(R.id.contname);
        contname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cnt = new Intent(EmgService.this, EmgNumber.class);
                startActivity(cnt);

            }

        });
        iv_back_app_info_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
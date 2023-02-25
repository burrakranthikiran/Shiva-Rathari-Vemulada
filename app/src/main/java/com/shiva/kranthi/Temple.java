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

public class Temple extends AppCompatActivity {

    ImageView iv_back_app_info_k;
    CardView prasadam,koneru,temple,accominatoin, kalyana_katta, queue_line, drinking_water;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple);
        iv_back_app_info_k = findViewById(R.id.iv_back_app_info);
        prasadam = findViewById(R.id.prasadam);
        koneru = findViewById(R.id.koneru);
        temple = findViewById(R.id.temple);
        accominatoin = findViewById(R.id.accominatoin);
        kalyana_katta = findViewById(R.id.kalyana_katta);
        queue_line = findViewById(R.id.queue_line);
        drinking_water = findViewById(R.id.drinking_water);

        drinking_water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Temple.this);
                dialog.setContentView(R.layout.drinking_water);
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
                notification_title.setText("Drinking water List");

                dw1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4675245 + "," + 78.8680484 ;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });

                dw2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4674232 + "," + 78.8686549 ;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });
                dw3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4673829 + "," + 78.871572 ;
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


        queue_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Temple.this);
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

                Notification_Button_ok.setText("Dharmadharshanam");
                Notification_Button_ok.setTextSize(12);
                Notification_Button_cancel.setText("Shigradharshanam");
                Notification_Button_cancel.setTextSize(12);
                // Setting up the notification dialog
                notification_title.setText("Queue Line");

                notification_image.setImageResource(R.drawable.queue_line);
//                notification_message.setText("Please choose the option");

                // On click on Continue
                Notification_Button_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4672665    + "," + 78.8693831 ;
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
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4674226 + "," + 78.8686545 ;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });

                dialog.show();



            }
        });

        kalyana_katta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Temple.this);
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

                Notification_Button_ok.setText("Kalyana Katta 2");
                Notification_Button_cancel.setText("Kalyana Katta 1");

                // Setting up the notification dialog
                notification_title.setText("Kalyana Katta");
                notification_image.setImageResource(R.drawable.kalyana_katta);
//                notification_message.setText("Please choose the option");

                // On click on Continue
                Notification_Button_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.467394 + "," + 78.8712224 ;
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
                        String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4672823 + "," + 78.8713219 ;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });

                dialog.show();



            }
        });

        accominatoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Temple.this);
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

                Notification_Button_ok.setText("View List");
                Notification_Button_cancel.setText("Book");

                // Setting up the notification dialog
                notification_title.setText("Accommodation");
                notification_image.setImageResource(R.drawable.accommodation);
//                notification_message.setText("Please choose the option");

                // On click on Continue
                Notification_Button_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Temple.this, AcconationList.class);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });
                // On click Cancel
                Notification_Button_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ts.meeseva.telangana.gov.in/meeseva/home.htm"));
                        startActivity(browserIntent);
                        dialog.dismiss();
                    }
                });

                dialog.show();



            }
        });
        iv_back_app_info_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        prasadam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4676318 + "," + 78.8707841 ;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        koneru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geoUri = "http://maps.google.com/maps?q=loc:" + 18.4674336 + "," + 78.8708418 ;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Temple.this);
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

                Notification_Button_ok.setText("Read Info");
                Notification_Button_cancel.setText("View Website");

                // Setting up the notification dialog
                notification_title.setText("Temple Info");
                notification_image.setImageResource(R.drawable.temple_01);
//                notification_message.setText("Please choose the option");

                // On click on Continue
                Notification_Button_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Temple.this, TemplePfd.class);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });
                // On click Cancel
                Notification_Button_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vemulawadatemple.telangana.gov.in/"));
                        startActivity(browserIntent);
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

    }
}
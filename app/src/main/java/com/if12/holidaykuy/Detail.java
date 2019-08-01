package com.if12.holidaykuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Detail extends AppCompatActivity {

    private TextView txtnama, txtlokasi, txtcaption, txtkontak, txtweb;
    private Double lat, lng;
    private LinearLayout btnMAPS;
    private ImageView imgUrl;

    String nama, lokasi, caption, gambar, kontak, web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtnama = (TextView) findViewById(R.id.detail_name_id);
        txtlokasi = (TextView) findViewById(R.id.location);
        txtcaption = (TextView) findViewById(R.id.deskripsi);
        btnMAPS = (LinearLayout) findViewById(R.id.btnMaps);
        imgUrl = (ImageView) findViewById(R.id.detail_img_id);
        txtkontak = (TextView) findViewById(R.id.phoneNumber);
        txtweb = (TextView) findViewById(R.id.webUrl);


        if(getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            nama = bundle.getString("nama");
            lokasi = bundle.getString("lokasi");
            caption = bundle.getString("caption");
            lat = bundle.getDouble("lat");
            lng = bundle.getDouble("lng");
            gambar = bundle.getString("gambar");
            kontak = bundle.getString("kontak");
            web = bundle.getString("web");

        }

        txtnama.setText(nama);
        txtlokasi.setText(lokasi);
        txtcaption.setText(caption);
        txtkontak.setText(kontak);
        txtweb.setText(web);

        GlideApp.with(this)
                .asBitmap()
                .load(gambar)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imgUrl);


        btnMAPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Detail.this, MapsActivity.class);

                //passing data to detail
                Bundle bundle = new Bundle();
                bundle.putString("nama", nama);
                bundle.putDouble("lat", lat);
                bundle.putDouble("lng", lng);
                intent.putExtras(bundle);

                //start activity
                startActivity(intent);
            }
        });
    }
}

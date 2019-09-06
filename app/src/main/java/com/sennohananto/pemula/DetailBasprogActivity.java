package com.sennohananto.pemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class DetailBasprogActivity extends AppCompatActivity {
    private AppCompatTextView tvTitle, tvDesc, tvDescLong, tvFounder, tvBorn, tvSite;
    private AppCompatImageView imgBasprog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_basprog);
        tvTitle = findViewById(R.id.tvJudul);
        tvDesc = findViewById(R.id.tvDesc);
        tvDescLong = findViewById(R.id.tvDescLong);
        tvFounder = findViewById(R.id.tvFounder);
        tvBorn = findViewById(R.id.tvBorn);
        tvSite = findViewById(R.id.tvSite);
        imgBasprog = findViewById(R.id.imgBasProg);

        Basprog basprog = (Basprog) getIntent().getSerializableExtra("basprog");
        getSupportActionBar().setTitle(basprog.getTitle());

        tvTitle.setText(basprog.getTitle());
        tvDesc.setText(basprog.getDesc());
        tvDescLong.setText(basprog.getDesclong());
        tvFounder.setText(basprog.getFounder());
        tvBorn.setText(basprog.getBorn());
        tvSite.setText(basprog.getSite());

        Glide.with(this).load(basprog.getImg()).into(imgBasprog);
    }
}

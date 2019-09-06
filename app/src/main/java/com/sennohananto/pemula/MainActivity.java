package com.sennohananto.pemula;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CardViewAdapterBasprog adapterBasprog;
    private List<Basprog> basprogList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recvBasprog);
        basprogList = new ArrayList<>();
        basprogList.add(
                new Basprog(
                R.drawable.kotlin,
                getResources().getString(R.string.kotlin),
                getResources().getString(R.string.kotlin_desc),
                getResources().getString(R.string.kotlin_desc_long),
                getResources().getString(R.string.kotlin_born),
                getResources().getString(R.string.kotlin_founder),
                getResources().getString(R.string.kotlin_site)
                )
        );
        basprogList.add(
                new Basprog(
                R.drawable.java,
                getResources().getString(R.string.Java),
                getResources().getString(R.string.Java_desc),
                getResources().getString(R.string.Java_desc_long),
                getResources().getString(R.string.Java_born),
                getResources().getString(R.string.Java_founder),
                getResources().getString(R.string.Java_site)
                )
        );
        
        basprogList.add(
                new Basprog(
                R.drawable.swift,
                getResources().getString(R.string.Swift),
                getResources().getString(R.string.Swift_desc),
                getResources().getString(R.string.Swift_desc_long),
                getResources().getString(R.string.Swift_born),
                getResources().getString(R.string.Swift_founder),
                getResources().getString(R.string.Swift_site)
                )
        );
        
        basprogList.add(
                new Basprog(
                R.drawable.cpp,
                getResources().getString(R.string.Cpp),
                getResources().getString(R.string.Cpp_desc),
                getResources().getString(R.string.Cpp_desc_long),
                getResources().getString(R.string.Cpp_born),
                getResources().getString(R.string.Cpp_founder),
                getResources().getString(R.string.Cpp_site)
                )
        );
        basprogList.add(
                new Basprog(
                R.drawable.python,
                getResources().getString(R.string.Python),
                getResources().getString(R.string.Python_desc),
                getResources().getString(R.string.Python_desc_long),
                getResources().getString(R.string.Python_born),
                getResources().getString(R.string.Python_founder),
                getResources().getString(R.string.Python_site)
                )
        );
        basprogList.add(
                new Basprog(
                R.drawable.php,
                getResources().getString(R.string.Php),
                getResources().getString(R.string.Php_desc),
                getResources().getString(R.string.Php_desc_long),
                getResources().getString(R.string.Php_born),
                getResources().getString(R.string.Php_founder),
                getResources().getString(R.string.Php_site)
                )
        );
        basprogList.add(
                new Basprog(
                R.drawable.dart,
                getResources().getString(R.string.Dart),
                getResources().getString(R.string.Dart_desc),
                getResources().getString(R.string.Dart_desc_long),
                getResources().getString(R.string.Dart_born),
                getResources().getString(R.string.Dart_founder),
                getResources().getString(R.string.Dart_site)
                )
        );
        
        basprogList.add(
                new Basprog(
                R.drawable.nodejs,
                getResources().getString(R.string.Nodejs),
                getResources().getString(R.string.Nodejs_desc),
                getResources().getString(R.string.Nodejs_desc_long),
                getResources().getString(R.string.Nodejs_born),
                getResources().getString(R.string.Nodejs_founder),
                getResources().getString(R.string.Nodejs_site)
                )
        );
        basprogList.add(
                new Basprog(
                R.drawable.assembly,
                getResources().getString(R.string.Assembly),
                getResources().getString(R.string.Assembly_desc),
                getResources().getString(R.string.Assembly_desc_long),
                getResources().getString(R.string.Assembly_born),
                getResources().getString(R.string.Assembly_founder),
                getResources().getString(R.string.Assembly_site)
                )
        );
        
        

        adapterBasprog = new CardViewAdapterBasprog(basprogList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(adapterBasprog);
    }
}

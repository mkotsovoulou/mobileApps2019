package com.maira.stylesandthemes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> colors = new ArrayList<>();

        colors.add(new Word("white","aspro"));
        colors.add(new Word("red","kokkino"));
        colors.add(new Word("black","mavro"));
        colors.add(new Word("yellow","kitrino"));
        colors.add(new Word("brown","kafe"));
        colors.add(new Word("pink","roz"));
        colors.add(new Word("blue","mple"));
        colors.add(new Word("green","prasino"));
        colors.add(new Word("orange","portokali"));
        colors.add(new Word("orange","portokali"));
        colors.add(new Word("orange","portokali"));
        colors.add(new Word("orange","portokali"));
        colors.add(new Word("orange","portokali"));
        colors.add(new Word("orange","portokali"));
        colors.add(new Word("orange","portokali"));
        colors.add(new Word("orange","portokali"));
        colors.add(new Word("orange","portokali"));

        WordAdapter colorsAdapter = new WordAdapter(this,colors);
        ListView colorList = (ListView) findViewById(R.id.rootElement);
        colorList.setAdapter(colorsAdapter);
    }


}

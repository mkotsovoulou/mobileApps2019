package com.maira.stylesandthemes;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> colors = new ArrayList<>();

        colors.add(new Word("white","aspro", R.drawable.color_white, R.raw.aspro));
        colors.add(new Word("red","kokkino", R.drawable.color_red, R.raw.kokkino));
        colors.add(new Word("black","mavro", R.drawable.color_black, R.raw.mavro));
        colors.add(new Word("yellow","kitrino", R.drawable.color_mustard_yellow, R.raw.kitrino));
     /*   colors.add(new Word("brown","kafe"));
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
        colors.add(new Word("orange","portokali"));*/

        WordAdapter colorsAdapter = new WordAdapter(this,colors);
        ListView colorList = (ListView) findViewById(R.id.rootElement);
        colorList.setAdapter(colorsAdapter);

        colorList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = colors.get(position);
                mp = MediaPlayer.create(ColorsActivity.this, word.getImageResourcesId());
                mp.start();
            }
        });




    }


}

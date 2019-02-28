package com.maira.kidrockapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Maira","Executing onCreate method");
        if (song == null)
            song = MediaPlayer.create(this, R.raw.allsumerlong);

    }

    public void playSong(View vew) {
             song.start();
    }

    public void pauseSong(View vew) {
             song.pause();
    }

    public void viewOnWeb(View view) {

        String url = "https://www.facebook.com/kidrock";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    @Override
    protected void onPause() {
        Log.i("Maira","Executing onPause method");
        song.pause();

        super.onPause();
    }

    @Override
    public void onResume(){
        Log.i("Maira","Executing onResume method");
        song.start();
        super.onResume();
    }
}

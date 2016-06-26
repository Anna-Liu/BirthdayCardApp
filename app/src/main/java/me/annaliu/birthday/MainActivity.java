package me.annaliu.birthday;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mySound = MediaPlayer.create(this, R.raw.music);
        mySound.start();
        mySound.setLooping(true);
        mySound.setVolume(100,100);
    }
}

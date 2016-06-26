package me.annaliu.birthday;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mySound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound = MediaPlayer.create(this, R.raw.music);
        mySound.start(); //automatically starts music
        mySound.setLooping(true);
        mySound.setVolume(100,100);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySound.pause();//pauses music when app is backgrounded
    }

    @Override
    protected void onResume() {
        super.onResume();
        mySound.start();//resumes music when app is active
    }
}


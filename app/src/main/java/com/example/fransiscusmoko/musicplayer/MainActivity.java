package com.example.fransiscusmoko.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer Music;
            int pause;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

            }
            public void mulai(View view) {
                if (Music == null) {
                    Music = MediaPlayer.create(this,R.raw.ben);
                    Music.start();
                    Toast.makeText(this, "Music Play", Toast.LENGTH_SHORT).show();
                } else if (!Music.isPlaying())
                    Music.seekTo(pause);
                Music.start();
            }

            public void jeda(View view) {
                if(Music!=null){
                    Music.pause();
                    pause = Music.getCurrentPosition();
                    Toast.makeText(this, "Music Pause", Toast.LENGTH_SHORT).show();}
            }

            public void henti(View view) {
                Music.stop();
                Music = null;
                Toast.makeText(this, "Music Stop", Toast.LENGTH_SHORT).show();
            }

            public void pilih(View view){

            }
        }

package com.example.final_prac04;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.text.style.TabStopSpan;
import android.widget.TabHost;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("탭호스트 - 망함.");

        TabHost tabhost = getTabHost();

        TabHost.TabSpec tabSpecSong = tabhost.newTabSpec("SONG").setIndicator("음악별");
        tabSpecSong.setContent(R.id.Song);
        tabhost.addTab(tabSpecSong);

        TabHost.TabSpec tabSpecArtist = tabhost.newTabSpec("SONG").setIndicator("음악별");
        tabSpecArtist.setContent(R.id.Artist);
        tabhost.addTab(tabSpecArtist);

        TabHost.TabSpec tabSpecAlbum = tabhost.newTabSpec("SONG").setIndicator("음악별");
        tabSpecAlbum.setContent(R.id.Album);
        tabhost.addTab(tabSpecAlbum);

        tabhost.setCurrentTab(0);

    }
}


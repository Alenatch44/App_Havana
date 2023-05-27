package com.example.myapplication.ui.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.myapplication.R;

public class StaticsActivity extends AppCompatActivity {
    VideoView videoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_statics);

//        videoPlayer = findViewById(R.id.videoPlayer);

//        videoPlayer.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.train_cardio));
//
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        videoPlayer.setMediaController(new MediaController(this));
//        videoPlayer.requestFocus(0);
//        videoPlayer.start();

        String SrcPath = "https://rr2---sn-o097znsz.googlevideo.com/videoplayback?expire=1654682921&ei=ySCgYpjJAZaxkgay6rLoDQ&ip=192.200.158.88&id=o-AI5792c7Zlgx1t075z_xzZHjwU_QV-XY4O6ySywKGQhI&itag=22&source=youtube&requiressl=yes&mh=8i&mm=31%2C26&mn=sn-o097znsz%2Csn-q4flrnsl&ms=au%2Conr&mv=m&mvi=2&pl=23&initcwndbps=405000&spc=4ocVC0ZOp-ZrbTgQZAoSPeBMg3InuoM&vprv=1&mime=video%2Fmp4&ns=hrxe3x6D4448XvDnBhe79D4G&cnr=14&ratebypass=yes&dur=1374.180&lmt=1630010984170335&mt=1654661104&fvip=2&fexp=24001373%2C24007246&c=WEB&txp=5432434&n=gN0HhkitRc0ysQ&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgerkPrdGHtvQ4F9bVI5WEu2Fodk_ABOxZf8cwCa5sHYQCIEE0Df5GUf_zQeOrapDM-YTq-EAhnPkMOkfTMPhPikPb&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRAIgaUQimhfkC_YC1iB3ZyMoGNw6xfi-jZRYNrByDJpdq8kCIBdliIfAnFits5_idEvB1OooxfyIAARGq2lt_l77N-xd&title=СТАТИКА%20НА%20ВСЁ%20ТЕЛО%20%7C%202%20УРОВЕНЬ%20%7C%20УПРУГАЯ%20И%20ЗДОРОВАЯ%20КОЖА%20%7C%20ТРЕНИРОВКА%2022X22%20БЕЗ%20ПРЫЖКОВ";
        videoPlayer = findViewById(R.id.videoPlayer);
        videoPlayer.setVideoURI(Uri.parse(SrcPath));
        videoPlayer.setMediaController(new MediaController(this));
        videoPlayer.requestFocus();
        videoPlayer.start();
    }

    public void play(View view){
        videoPlayer.start();
    }
    public void pause(View view){
        videoPlayer.pause();
    }
    public void stop(View view){
        videoPlayer.stopPlayback();
        videoPlayer.resume();
    }
}
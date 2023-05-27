package com.example.myapplication.ui.video;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import android.widget.MediaController;

import com.example.myapplication.R;


public class VideoActivity extends AppCompatActivity {
    VideoView videoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_video);



//        videoPlayer.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.train_cardio));

        String SrcPath = "https://rr3---sn-xgmnpoxuopp-ioqe.googlevideo.com/videoplayback?expire=1654682975&ei=_iCgYoy1O5KlvdIP5--1yA8&ip=219.100.37.236&id=o-AN3pQJ1b9bnFI0RuXZ_8eGq5xExfkCqxNqTNDrIlyNC3&itag=22&source=youtube&requiressl=yes&mh=ZE&mm=31%2C29&mn=sn-xgmnpoxuopp-ioqe%2Csn-3pm7dnel&ms=au%2Crdu&mv=m&mvi=3&pl=24&initcwndbps=180000&spc=4ocVC3nB5810raegD5aNbCqnRGqz1ew&vprv=1&mime=video%2Fmp4&ns=w01Azd2dmQByDjOeJbVYaakG&cnr=14&ratebypass=yes&dur=743.828&lmt=1652260373632448&mt=1654661104&fvip=5&fexp=24001373%2C24007246&c=WEB&txp=5432434&n=Vn5AyaDjJf-QsQ&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgJcFjNrThKkxixUamT2O0eRtXCPj8WeFqlVgQGFoPDHwCICj8_d42TFl-917OvIfz_juCg5qdOWDMo_nDiM_i6FQV&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRQIgR9U87ZDYh6h1xHB6pQdFi4EjgAkQHmYhKI6Su9IssngCIQC4VvlwrVxTU5VtuCBVF6zWpkgQeEiPPbUbl7FdWm1M4A%3D%3D&title=БЫСТРАЯ%20ЖИРОСЖИГАЮЩАЯ%20ТРЕНИРОВКА%20На%20Всё%20Тело%20%7C%20Кардио%20за%2010%20минут%20%20%7C%20Сжечь%20250%20КАЛОРИЙ%20с%2022x22";
        videoPlayer = findViewById(R.id.videoPlayer);
        videoPlayer.setVideoURI(Uri.parse(SrcPath));
        videoPlayer.setMediaController(new MediaController(this));
        videoPlayer.requestFocus();
        videoPlayer.start();

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        videoPlayer.setMediaController(new MediaController(this));
//        videoPlayer.requestFocus(0);
//        videoPlayer.start();
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
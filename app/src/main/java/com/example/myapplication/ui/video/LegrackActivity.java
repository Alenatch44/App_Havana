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

public class LegrackActivity extends AppCompatActivity {
    VideoView videoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_legrack);

        String SrcPath = "https://rr1---sn-5goeenes.googlevideo.com/videoplayback?expire=1654684192&ei=wCWgYseCIbSD0u8Pgu2kkAk&ip=84.247.50.238&id=o-AG9ngy97sA1bbbiFq16hMWyKTktXx4OvIK6HktWcrKxF&itag=22&source=youtube&requiressl=yes&mh=Y3&mm=31%2C26&mn=sn-5goeenes%2Csn-aigl6n7z&ms=au%2Conr&mv=m&mvi=1&pl=24&initcwndbps=631250&spc=4ocVC5al7rpf7JE6KKT2rpLGOKHwfVk&vprv=1&mime=video%2Fmp4&ns=HlNN-j8lMAVdo14iCEAXuccG&ratebypass=yes&dur=181.881&lmt=1572004316903375&mt=1654662311&fvip=6&fexp=24001373%2C24007246&c=WEB&txp=2216222&n=Ytr6Sr-ROOKXEw&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAOfzt8Js-pIHX3noegRegJjBBcTNNmotg4U7yxdQaieMAiA2TsTNvEqpZ4rTKw96X7T8GLMxTQo9IyqLK2bg7EoVfg%3D%3D&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRAIgENFfjhQ7bEntnwCiTfZ07ivsmhFPvP2BUtSmw5xAzsoCIDpza9vd1U6msctGYIDpBuZIKdroNKXHElF4j3hrnnM4&title=Приседания%20со%20штангой%20-%20Роман%20Михайленко";
        videoPlayer = findViewById(R.id.videoPlayer);
        videoPlayer.setVideoURI(Uri.parse(SrcPath));
        videoPlayer.setMediaController(new MediaController(this));
        videoPlayer.requestFocus();
        videoPlayer.start();


//        videoPlayer = findViewById(R.id.videoPlayer);
//
//        videoPlayer.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.train_legrack));
//
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
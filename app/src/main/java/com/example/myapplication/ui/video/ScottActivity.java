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

public class ScottActivity extends AppCompatActivity {
    VideoView videoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_scott);

        String SrcPath = "https://rr2---sn-5ualdn7y.googlevideo.com/videoplayback?expire=1654683900&ei=nCSgYp7tNaGV2_gPxIOduAM&ip=205.185.209.222&id=o-AD_nGeQB-o9fp_IFAAc_6AlNJpxz0ZQE_-gvXUI3aYjm&itag=22&source=youtube&requiressl=yes&mh=Rt&mm=31%2C26&mn=sn-5ualdn7y%2Csn-q4fl6nss&ms=au%2Conr&mv=m&mvi=2&pl=27&initcwndbps=1410000&spc=4ocVCzWktvFIxm4ZMs9dyIZLY9hZMLQ&vprv=1&mime=video%2Fmp4&ns=Ca03XBW4bCjaOFeLkJ1wioUG&cnr=14&ratebypass=yes&dur=161.053&lmt=1472405059802485&mt=1654662057&fvip=3&fexp=24001373%2C24007246&c=WEB&n=151vrw2qWC_DWg&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgDROcP_Vv8sZlxzgn0ks4GA5a2MIFo8LKc6oxdXc2bjMCIGHYferRwmV57ejjPTsUNtxKn3_rPtcaF27R2Z-0VB8S&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRAIgQLQLqRLeBBLjdZaiMTTAsH6_hwv-6oR7Cp-2bodb6bgCIDVULnrTfwvi6RGYR_rNGC5qO6mad95ZyOHwZUxcybm1&title=Упражнения%20для%20бицепсов.%20Сгибания%20на%20скамье%20Скотта.";
        videoPlayer = findViewById(R.id.videoPlayer);
        videoPlayer.setVideoURI(Uri.parse(SrcPath));
        videoPlayer.setMediaController(new MediaController(this));
        videoPlayer.requestFocus();
        videoPlayer.start();


//        videoPlayer = findViewById(R.id.videoPlayer);
//
//        videoPlayer.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.train_scott));
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
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

public class ChestbenchActivity extends AppCompatActivity {
    VideoView videoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_chestbench);

        String SrcPath = "https://rr4---sn-h5q7kned.googlevideo.com/videoplayback?expire=1654683993&ei=-SSgYtCvMKS9mLAPiaS-mAE&ip=195.181.167.36&id=o-ADvhpK0bHr615XYTcE2dJOiw29ap3qWqsKzRTJEvDKy5&itag=22&source=youtube&requiressl=yes&mh=-s&mm=31%2C29&mn=sn-h5q7kned%2Csn-h5qzen7y&ms=au%2Crdu&mv=m&mvi=4&pl=25&initcwndbps=1557500&spc=4ocVC_wGA0mnF8BFITgiQauZISwxk6M&vprv=1&mime=video%2Fmp4&ns=7WJuYai58B0EX3W_P4POrXMG&cnr=14&ratebypass=yes&dur=379.065&lmt=1630408239880393&mt=1654662057&fvip=4&fexp=24001373%2C24007246&c=WEB&txp=5432434&n=3UjqRzWUKeVFMQ&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRgIhAJjfrpk5ic24DIKX8Z2UCSpt03v60MS0Gptw-WU-erh2AiEAq5j0sx_cMCaLMdos2_TspNi6Do5yTMKaNETvUX1JLL4%3D&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRQIgUinCBp2K9mhRvmk3WHuVpuisWDfkArgsT9ls5qetpFQCIQD_a2SF8F6aXRjHhhkMJl4Qnr2lbwTa_Q9RMWUrWRdsbQ%3D%3D&title=ЖИМ%20ЛЕЖА.%20Как%20выполнять%20ЖИМ%20ЛЕЖА%20без%20боли%20в%20плече!%20Техника";
        videoPlayer = findViewById(R.id.videoPlayer);
        videoPlayer.setVideoURI(Uri.parse(SrcPath));
        videoPlayer.setMediaController(new MediaController(this));
        videoPlayer.requestFocus();
        videoPlayer.start();

//        videoPlayer = findViewById(R.id.videoPlayer);
//
//        videoPlayer.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.train_chestbench));
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